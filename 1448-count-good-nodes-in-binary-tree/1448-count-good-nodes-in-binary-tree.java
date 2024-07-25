/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    // initiate the number of good nodes variable
    private int numNode = 0;

    public int goodNodes(TreeNode root) {
        
        dfs(root, Integer.MIN_VALUE);
        return numNode;
    }
    
    private void dfs(TreeNode root, int max){
        if(max <= root.val){
            numNode++;
        }
        
        if(root.right != null){
            dfs(root.right, Math.max(max, root.val));
        }
        if(root.left != null){
            dfs(root.left, Math.max(max, root.val));
        }
    }
}