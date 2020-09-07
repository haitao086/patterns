package algorithms;

public class TestMain {
    public static void main(String[] args) {
        Solution solu = new Solution() ;
        int[] arr = {3,1,5,0,2,4,6} ;
        TreeNode node = TreeNode.insertTreeNode(arr, 0) ;
        System.out.println(solu.isValidBST(node));

    }





}
