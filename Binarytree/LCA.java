package Binarytree;

import java.util.*;

public class LCA {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean leftfound = getpath(root.left, n, path);
        boolean rightfound = getpath(root.right, n, path);
        if (leftfound || rightfound) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);
        return lca;

    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        if (leftlca == null) {
            return rightlca;
        }
        if (rightlca == null) {
            return leftlca;
        }
        return root;
    }

    // MINIMUM DISTANCE BETWEEN NODE
    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftdist = lcaDist(root.left, n);
        int rightdist = lcaDist(root.right, n);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        } else if (leftdist == -1) {
            return rightdist + 1;
        } else {
            return leftdist + 1;
        }
    }

    public static int mindist(Node root, int n1, int n2) {
        Node lc = lca2(root, n1, n2);
        int dist1 = lcaDist(lc, n1);
        int dist2 = lcaDist(lc, n2);

        return dist1 + dist2;
    }

    // KTH ANCESTOR OF NODE
    public static int KthAncestor(Node root, int k, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == k) {
            return 0;
        }
        int leftdist = KthAncestor(root.left, k, n);
        int rightdist = KthAncestor(root.right, k, n);
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }
        int max = Math.max(leftdist, rightdist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;

    }
    // TRANSFORM TO SUM OF TREE

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }
        int leftchild = transform(root.left);
        int rightchild = transform(root.right);

        int data = root.data;

        root.data = root.left.data + leftchild + root.right.data + rightchild;

        return data;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5, n = 5, k = 2;
        System.out.println(lca(root, n1, n2).data);
        System.out.println(lca2(root, n1, n2).data);

        System.out.println(mindist(root, n1, n2));
        System.out.println(KthAncestor(root, k, n));

        transform(root);
        preorder(root);
        printRootleaf(root, new ArrayList<>());
    }
}
