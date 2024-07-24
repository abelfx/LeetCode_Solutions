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

    // numberofgoodnodes variables
    private int numNodes = 0;

    public int goodNodes(TreeNode root) {

        dfs(root, Integer.MIN_VALUE);

        return numNodes;
        
    }

    private void dfs(TreeNode node, int max){
        if(max <= node.val){
            numNodes++;
        }

        if(node.right != null){
            dfs(node.right, Math.max(max, node.val));
        }

        if(node.left != null){
            dfs(node.left, Math.max(max, node.val));
        }
    }
}