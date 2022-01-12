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
    public int ans = 0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root,"");
        return ans;
    }
    private void dfs(TreeNode root,String num_str) {
        if (root == null) {
            return ;
        }
        if (root.left == null && root.right == null) {
            num_str += Integer.toString(root.val);
            ans += Integer.parseInt(num_str,2);
        }
        dfs(root.left,num_str+Integer.toString(root.val));
        dfs(root.right,num_str+Integer.toString(root.val));
    }
}
