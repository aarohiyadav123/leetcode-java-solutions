/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public boolean contains(TreeNode root, TreeNode curr) {
        if (root == null) return false;
        if (root == curr) return true;

        return contains(root.left, curr) || contains(root.right, curr);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;
        if (root == p || root == q) return root;

        boolean leftP = contains(root.left, p);
        boolean leftQ = contains(root.left, q);

        // Ek left me aur ek right me
        if (leftP != leftQ) {
            return root;
        }

        // Dono left subtree me hain
        if (leftP) {
            return lowestCommonAncestor(root.left, p, q);
        }

        // Dono right subtree me hain
        return lowestCommonAncestor(root.right, p, q);
    }
}