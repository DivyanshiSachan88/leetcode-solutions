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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Dono null hain
        if (p == null && q == null) {
            return true;
        }

        // Ek null hai aur doosra nahi
        if (p == null || q == null) {
            return false;
        }

        // Values alag hain
        if (p.val != q.val) {
            return false;
        }

        // Left aur Right subtree compare karo
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}