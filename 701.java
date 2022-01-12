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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //iterative method
        if (root == null) {
            TreeNode t = new TreeNode(val);
            return t;
        }
        TreeNode cur = root;
        while ( cur != null ) {
            if (cur.val < val && cur.right != null) {
                cur = cur.right;
            }  else if (cur.val > val && cur.left != null) {
                cur = cur.left;
            } else {
                if (cur.val < val ) {
                    cur.right = new TreeNode(val=val);
                } else if ( cur.val > val) {
                    cur.left = new TreeNode(val=val);
                }
            break;
            }
        }
        return root;
    }
}
