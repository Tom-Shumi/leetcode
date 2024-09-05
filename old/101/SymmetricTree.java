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
    if (root == null) {
      return true;
    }

    return r(root.left, root.right);
  }

  private boolean r(TreeNode left, TreeNode right) {
    if (left == null || right == null) {
      if (left == null && right == null) {
        return true;
      } else {
        return false;
      }
    }

    if (left.val != right.val) {
      return false;
    }

    boolean lBool = r(left.left, right.right);
    boolean rBool = r(left.right, right.left);

    return lBool && rBool;
  }
}