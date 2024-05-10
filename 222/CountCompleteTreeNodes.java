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
  public int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }

    return r(root, 0);
  }

  private int r(TreeNode node, int count) {

    if (node != null) {
      count = count + 1;
    }

    if (node == null || (node.left == null && node.right == null)) {
      return count;
    }

    if (node.left != null) {
      count = r(node.left, count);
    }

    if (node.right != null) {
      count = r(node.right, count);
    }

    return count;
  }
}