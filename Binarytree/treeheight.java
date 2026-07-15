package Binarytree;

public class treeheight {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    // Height of tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;

    }

    // Count the Node in tree
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftcount = count(root.left);
        int rightcouint = count(root.right);

        return leftcount + rightcouint + 1;
    }

    // sum of Node in tree
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);

        return leftsum + rightsum + root.data;
    }

    // Diameter of Tree

    public static int Diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int left_dia = Diameter(root.left);
        int right_dia = Diameter(root.right);
        int left_height = height(root.left);
        int right_height = height(root.right);
        int self_dia = left_height + right_height + 1;

        return Math.max(self_dia, Math.max(left_dia, right_dia));

    }

    public static void Kthlevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data+" ");
            return;
        }
        Kthlevel(root.left, level + 1, k);
        Kthlevel(root.right, level + 1, k);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Height of tree" + height(root));
        System.out.println("total count of nodes in tree " + count(root));
        System.out.println("Sum of nodes " + sum(root));
        System.out.println("Diameter of tree " + Diameter(root));

        int k = 3;
        System.out.println("kth level data called ");
        Kthlevel(root, 1, k);

    }
}
