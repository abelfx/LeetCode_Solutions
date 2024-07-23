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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList();
         ArrayList<Integer> list2 = new ArrayList();
        
        dfs(list1, root1);
        dfs(list2, root2);
        
        return list1.equals(list2);
        
    }
    
    private void dfs(ArrayList<Integer> list, TreeNode root){
        if(root == null) return;
        
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        
        dfs(list, root.left);
        dfs(list, root.right);
    }
}