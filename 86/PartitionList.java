/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode partition(ListNode head, int x) {
    if (head == null) {
      return null;
    }

    ListNode small = new ListNode(101);
    ListNode large = new ListNode(101);
    int smallCount = 0;
    int largeCount = 0;

    ListNode current = head;
    ListNode smallHead = small;
    ListNode largeHead = large;
    while (true) {
      if (current == null) {
        break;
      }

      if (current.val < x) {
        small.val = current.val;
        small.next = new ListNode();
        small = small.next;
        smallCount++;
      } else {
        large.val = current.val;
        large.next = new ListNode();
        large = large.next;
        largeCount++;
      }

      current = current.next;
    }
    large.next = null;
    if (large.val != 101) {
      small.next = largeHead;
    }

    if (small.val == 101) {
      smallHead = largeHead;
    }
    current = smallHead;
    int count = 0;
    while (true) {
      if (current == null) {
        break;
      }

      count++;
      if (count == smallCount) {
        current.next = current.next.next;
      }

      if (count == smallCount + largeCount) {
        current.next = null;
      }
      current = current.next;
    }

    return smallHead;
  }
}