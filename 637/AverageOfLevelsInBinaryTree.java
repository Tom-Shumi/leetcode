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
  public List<Double> averageOfLevels(TreeNode root) {

    List<Double> averages = new ArrayList<>();
    if (root == null) {
      return averages;
    }

    Queue<TreeNode> queue = new ArrayDeque();
    queue.offer(root);

    while (!queue.isEmpty()) {
      Queue<TreeNode> nextQueue = new ArrayDeque();
      double levelSum = 0;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        levelSum = levelSum + node.val;

        if (node.left != null) {
          nextQueue.offer(node.left);
        }
        if (node.right != null) {
          nextQueue.offer(node.right);
        }
      }
      double ave = levelSum / size;
      averages.add(ave);
      queue = nextQueue;
    }

    return averages;
  }
}