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
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }

    TreeNode result = r(root);

    return result;
  }

  private TreeNode r(TreeNode node) {
    if (node == null || (node.left == null && node.right == null)) {
      return node;
    }

    TreeNode l = r(node.left);
    TreeNode r = r(node.right);

    node.left = r;
    node.right = l;

    return node;
  }
}