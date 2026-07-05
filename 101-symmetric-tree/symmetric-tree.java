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

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {

        // Dono null hain
        if (left == null && right == null) {
            return true;
        }

        // Ek null hai
        if (left == null || right == null) {
            return false;
        }

        // Values match nahi karti
        if (left.val != right.val) {
            return false;
        }

        // Mirror check
        return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }
}