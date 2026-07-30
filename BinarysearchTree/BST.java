package BinarysearchTree;

import java.util.ArrayList;

public class BST {
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

    // BUILD BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // SEARCHING
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // DELETE NODE
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // means node found that has to be deleted
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 both childern
            Node IS = findInorderSucessor(root.left);
            root.data = IS.data;
            root.right = delete(root.right, val);
        }
        return root;
    }

    public static Node findInorderSucessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // print nodes between nodes
    public static void printrange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printrange(root.left, k1, k2);
            System.out.println(root.data + " ");
            printrange(root.right, k1, k2);
        } else if (root.data < k1) {
            printrange(root.left, k1, k2);
        } else {
            printrange(root.right, k1, k2);
        }
    }
    // Root to leaf path

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();

    }

    public static void printRootleaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRootleaf(root.left, path);
        printRootleaf(root.right, path);
        path.remove(path.size() - 1);

    }

    // valid BST
    public static boolean isvalidbst(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isvalidbst(root.left, min, root) && isvalidbst(root.right, root, max);
    }

    // MIRROR OF BST

    public static Node mirrorBst(Node root) {
        if (root == null) {
            return null;
        }
        Node ls = mirrorBst(root.left);
        Node rs = mirrorBst(root.right);
        root.left = rs;
        root.right = ls;

        return root;
    }

    /// MAIN FUNCTION
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        if (search(root, 4)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        // root = delete(root, 2);
        inorder(root);
        printrange(root, 5, 12);
        printRootleaf(root, new ArrayList<>());
        if (isvalidbst(root, null, null)) {
            System.out.println("valid BST");
        } else {
            System.out.println("not valid ");
        }
        mirrorBst(root);
        inorder(root);
    }
}
