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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 0) {
            return head;
        }
        int nodeCount = 0;
        ListNode current = head;
        
        while (true) {
            if (current == null) {
                break;
            }
            nodeCount++;
            current = current.next;
        }
        
        int rotate = nodeCount - (k % nodeCount);
        // --------------------
        int processCount = 0;
        current = head;
        ListNode result = head;
        while (true) {
            if (current == null) {
                break;
            }
            processCount++;
            ListNode bk = current.next;
            if (processCount == rotate) {
                current.next = null;
                current = bk;
            } else if (processCount == rotate + 1 && processCount == nodeCount) {
                result = current;
                current.next = head;
            }
            else if (processCount == rotate + 1) {
                result = current;
                current = current.next;
            } else if (processCount == nodeCount) {
                current.next = head;
            } else {
                current = current.next;
            }
        }
        
        return result;
    }
}