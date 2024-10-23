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

    int k;
    int count = 0;

    HashMap<Long, Integer> map = new HashMap();

    public int pathSum(TreeNode root, int targetSum) {
        k = targetSum;

        helper(root, 0);

        return count;

    }

    public void helper(TreeNode root, long sum){
        if(root == null) return;

        sum += root.val;

        if(sum == k) {
            count++;
        }

        count += map.getOrDefault(sum-k, 0);

        map.put(sum, map.getOrDefault(sum, 0) + 1);

        helper(root.left, sum);
        helper(root.right, sum);

        map.put(sum, map.get(sum) - 1);
    }
}