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

  public int maxDepth(TreeNode root) {
    TreeNode current = root;

    if (root == null) {
      return 0;
    }

    int maxDepth = r(current, 1);

    return maxDepth;
  }

  private int r(TreeNode c, int maxDepth) {
    if (c == null || (c.left == null && c.right == null)) {
      return maxDepth;
    }
    maxDepth++;
    int r = r(c.right, maxDepth);
    int l = r(c.left, maxDepth);
    return r > l ? r : l;
  }
}