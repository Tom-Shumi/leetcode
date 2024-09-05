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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<ListNode> leftList = new ArrayList<ListNode>();
        List<ListNode> middleList = new ArrayList<ListNode>();
        List<ListNode> rightList = new ArrayList<ListNode>();
        
        ListNode current = head;
        int count = 1;
        while (true) {
            if (current == null) {
                break;
            }
            
            if (count < left) {
                leftList.add(current);
            } else if (left <= count && count <= right) {
                middleList.add(current);
            } else {
                rightList.add(current);
            }
            
            current = current.next;
            count++;
        }
        
        Collections.reverse(middleList);
        
        List<ListNode> list = new ArrayList<ListNode>();
        list.addAll(leftList);
        list.addAll(middleList);
        list.addAll(rightList);
        ListNode result = list.get(0);
        
        
        current = result;
        for (int i = 1; i < list.size(); i++) {
            current.next = list.get(i);
            current = current.next;
        }
        
        current.next = null;
        
        return result;
    }
}