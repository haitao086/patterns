package algorithms;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        TreeNode treeNode = new TreeNode(1);
        treeNode = TreeNode.insertTreeNode(arr, 0);
        TreeNode.printInBFS(treeNode);
        System.out.println("-----------");
        TreeNode.printInDFS(treeNode);


//        Solution solu = new Solution() ;
//        int[] arr = {3,1,5,0,2,4,6} ;
//        TreeNode node = TreeNode.insertTreeNode(arr, 0) ;
//        System.out.println(solu.isValidBST(node));

    }





}
