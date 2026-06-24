class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null) return false;

        // Leaf node
        if(root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);

        return left || right;
    }
}