package algorithms;

class Solution {

    //98. Validate Binary Search Tree
    boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left != null) {
            if (root.left.val > root.val) {
                return false;
            }
            if (!isValidBST(root.left)) return false;
        }

        if (root.right != null) {
            if (root.right.val < root.val) {
                return false;
            }
            if (!isValidBST(root.right)) return false;
        }

        return isValidChildren(root.left, root.val, true) && isValidChildren(root.right, root.val, false);

    }


    private boolean isValidChildren(TreeNode node, int val, boolean left) {
        boolean status = true;
        if (node == null) return true;
        if ((left && node.val >= val) || (!left && node.val <= val)) return false;
        if (left) {
            return isValidChildren(node.left, val, left) && isValidChildren(node.right, val, left);
        } else {
            return isValidChildren(node.left, val, left) && isValidChildren(node.right, val, left);
        }

    }

}