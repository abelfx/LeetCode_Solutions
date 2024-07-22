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
        ArrayList<Integer> leave1 = new ArrayList();
        ArrayList<Integer> leave2 = new ArrayList();

        DFS(leave1, root1);
        DFS(leave2, root2);

        return leave1.equals(leave2);

    }

    private void DFS(List<Integer> leave, TreeNode root){
        if(root == null) return;

        if(root.left == null && root.right == null){
            leave.add(root.val);
        }

        DFS(leave, root.left);
        DFS(leave, root.right);
    }
}