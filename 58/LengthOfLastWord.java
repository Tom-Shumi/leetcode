class Solution {
  public int lengthOfLastWord(String s) {
    String trimed = s.trim();
    String[] splited = trimed.split(" ");

    return splited[splited.length - 1].length();
  }
}