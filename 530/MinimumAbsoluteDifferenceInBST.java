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

  private int result = Integer.MAX_VALUE;
  private ArrayList<Integer> list;
  public int getMinimumDifference(TreeNode root) {
    list = new ArrayList<>();
    r(root);
    return result;
  }

  private void r(TreeNode node) {
    list.add(node.val);
    if (node.left != null) {
      for (int i = 0; i < list.size(); i++) {
        result = Math.min(Math.abs(list.get(i) - node.left.val), result);
      }

      r(node.left);
    }
    if (node.right != null) {
      for (int i = 0; i < list.size(); i++) {
        result = Math.min(Math.abs(list.get(i) - node.right.val), result);
      }
      r(node.right);
    }
  }
}