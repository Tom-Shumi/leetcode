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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    int sumVal = l1.val + l2.val;
    int digit = 0;
    if (10 <= sumVal) {
      digit = 1;
      sumVal = sumVal % 10;
    }

    ListNode result = new ListNode(sumVal, r(l1.next, l2.next, digit));

    return result;
  }

  private ListNode r(ListNode l1, ListNode l2, int digit) {
    if (l1 == null && l2 == null) {
      if (digit == 1) {
        return new ListNode(1);
      }
      return null;
    }

    int l1Val = l1 == null ? 0 : l1.val;
    int l2Val = l2 == null ? 0 : l2.val;

    int sumVal = l1Val + l2Val + digit;

    digit = 0;
    if (10 <= sumVal) {
      digit = 1;
      sumVal = sumVal % 10;
    }

    ListNode l1Next = l1 == null ? null : l1.next;
    ListNode l2Next = l2 == null ? null : l2.next;
    return new ListNode(sumVal, r(l1Next, l2Next, digit));
  }
}