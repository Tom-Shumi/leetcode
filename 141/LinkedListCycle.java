/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
    Set<ListNode> listNodeSet = new HashSet<>();

    if (head == null) {
      return false;
    }

    ListNode nowNode = head;

    while (true) {
      if (nowNode.next == null) {
        return false;
      }
      if (listNodeSet.contains(nowNode)) {
        return true;
      } else {
        listNodeSet.add(nowNode);
      }

      nowNode = nowNode.next;
    }
  }
}