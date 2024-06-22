/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
  public Node copyRandomList(Node head) {
    if (head == null) {
      return null;
    }
    Node result = new Node(head.val);
    Map<Node, Node> map = new HashMap<>();

    result.next = rNext(head.next, map);
    map.put(head, result);

    Node target = result;
    Node headTarget = head;
    while (true) {
      if (target == null) {
        break;
      }
      Node targetRandom = map.get(headTarget.random);

      target.random = targetRandom;
      target = target.next;
      headTarget = headTarget.next;
    }

    return result;
  }

  private Node rNext(Node next, Map<Node, Node> map) {

    if (next == null) {
      return null;
    }

    Node node = new Node(next.val);
    map.put(next, node);
    node.next = rNext(next.next, map);
    return node;
  }
}