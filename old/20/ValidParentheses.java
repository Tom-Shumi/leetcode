class Solution {
  public boolean isValid(String s) {
    if (s.length() % 2 == 1) {
      return false;
    }
    Stack<Character> stack = new Stack();
    Map<Character, Character> endBrackets = new HashMap<>();
    endBrackets.put(')', '(');
    endBrackets.put('}', '{');
    endBrackets.put(']', '[');

    for (int i = 0; i < s.length(); i++) {
      Character cs = s.charAt(i);
      if (endBrackets.containsKey(cs)) {
        if (stack.size() == 0) {
          return false;
        }
        Character stackTop = stack.pop();
        Character startBracket = endBrackets.get(cs);
        if (!stackTop.equals(startBracket)) {
          return false;
        }
      } else {
        stack.push(cs);
      }
    }
    if (stack.size() == 0) {
      return true;
    }
    return false;
  }
}