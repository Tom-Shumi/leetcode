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
  public ListNode deleteDuplicates(ListNode head) {

    ListNode top = new ListNode(101, head);
    ListNode current = top;
    ListNode after1 = null;
    ListNode after2 = null;
    boolean deleteFlg = false;

    if (current != null) {
      after1 = current.next;
    }

    if (after1 != null) {
      after2 = after1.next;
    }

    while (true) {
      if (current == null) {
        break;
      }

      int after1Val = 101;
      int after2Val = 102;
      deleteFlg = false;

      if (after1 != null) {
        after1Val = after1.val;
      }
      if (after2 != null) {
        after2Val = after2.val;
      }

      if (after1Val == after2Val) {
        deleteFlg = true;
        if (after2 != null) {
          current.next = after2.next;
        }
      }
      if (deleteFlg) {
        ListNode after = after2.next;
        while (true) {
          if (after == null) {
            break;
          }

          if (after.val == after1Val) {
            current.next = after.next;
          } else {
            break;
          }

          after = after.next;
        }
      } else {
        current = current.next;
      }
      if (current != null) {
        after1 = current.next;
      }

      if (after1 != null) {
        after2 = after1.next;
      }
    }

    return top.next;
  }
}