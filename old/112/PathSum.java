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
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }

    return r(root, targetSum, 0);
  }

  private boolean r(TreeNode node, int targetSum, int total) {
    total = total + node.val;

    if (node.left == null && node.right == null) {
      return targetSum == total;
    }

    boolean lBool = false;
    boolean rBool = false;
    if (node.left != null) {
      lBool = r(node.left, targetSum, total);
    }

    if (node.right != null) {
      rBool = r(node.right, targetSum, total);
    }

    return lBool || rBool;
  }
}