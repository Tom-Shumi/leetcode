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
  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums.length == 1) {
      return new TreeNode(nums[0]);
    }

    int middleIndex = nums.length / 2;
    TreeNode middleNode = new TreeNode(nums[middleIndex]);

    return r(nums, middleNode);
  }

  private TreeNode r(int[] nums, TreeNode node) {
    if (nums.length <= 1) {
      return node;
    } else if (nums.length == 2) {
      TreeNode lastNode = new TreeNode(nums[0]);
      if (node.val < nums[0]) {
        node.right = lastNode;
      } else {
        node.left = lastNode;
      }
      return node;
    }

    int middleIndex = nums.length / 2;

    int[] left = Arrays.copyOfRange(nums, 0, middleIndex);
    int[] right = Arrays.copyOfRange(nums, middleIndex + 1, nums.length);

    if (left.length != 0) {
      int leftMiddleIndex = left.length / 2;
      TreeNode leftMiddleNode = new TreeNode(left[leftMiddleIndex]);
      node.left = r(left, leftMiddleNode);
    }

    if (right.length != 0) {
      int rightMiddleIndex = right.length / 2;
      TreeNode rightMiddleNode = new TreeNode(right[rightMiddleIndex]);
      node.right = r(right, rightMiddleNode);
    }

    return node;
  }
}