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
    if (p == null || q == null) {
      return p == null && q == null;
    }

    boolean result = r(p, q);

    return result;
  }

  private boolean r(TreeNode p, TreeNode q) {
    if (p == null || q == null) {
      return p == null && q == null;
    }
    if (p.val != q.val) {
      return false;
    }

    boolean lBool = r(p.left, q.left);
    boolean rBool = r(p.right, q.right);

    return lBool && rBool;
  }
}