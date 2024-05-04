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
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    List<ListNode> list = new ArrayList<>();

    while (true) {
      if (list1 == null && list2 == null) {
        break;
      } else if (list1 == null) {
        list.add(new ListNode(list2.val));
        list2 = list2.next;
      } else if (list2 == null) {
        list.add(new ListNode(list1.val));
        list1 = list1.next;
      } else if (list1.val <= list2.val) {
        list.add(new ListNode(list1.val));
        list1 = list1.next;
      } else {
        list.add(new ListNode(list2.val));
        list2 = list2.next;
      }
    }

    for (int i = 0; i < list.size() - 1; i++) {
      list.get(i).next = list.get(i + 1);
    }

    if (list.size() == 0) {
      return null;
    }
    return list.get(0);
  }
}