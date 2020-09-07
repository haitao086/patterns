package algorithms;

import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    public static TreeNode insertTreeNode(int[] arr, int i) {
        TreeNode root = null;
        if (i < arr.length) {
            root = new TreeNode(arr[i]);
            root.left = insertTreeNode(arr, 2 * i + 1);
            root.right = insertTreeNode(arr, 2 * i + 2);
        }
        return root;
    }

    public static void printInDFS(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            printInDFS(root.left);
            printInDFS(root.right);
        }
    }

    public static void printInBFS(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        if (root == null) return;
        q.push(root);
        TreeNode tmpNode;
        while (q.size() > 0) {
            tmpNode = q.pollLast();
            if (tmpNode != null) {
                System.out.println(tmpNode.val);
                q.push(tmpNode.left);
                q.push(tmpNode.right);
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        TreeNode treeNode = new TreeNode(1);
        treeNode = TreeNode.insertTreeNode(arr, 0);
        TreeNode.printInBFS(treeNode);
    }
}
