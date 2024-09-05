class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length()) {
      return false;
    }

    Map<Character, Integer> ransomNoteMap = new HashMap<Character, Integer>();
    Map<Character, Integer> magazineMap = new HashMap<Character, Integer>();

    for (int i = 0; i < magazine.length(); i++) {
      if (i < ransomNote.length()) {
        Integer r = ransomNoteMap.get(ransomNote.charAt(i));
        if (r == null) {
          ransomNoteMap.put(ransomNote.charAt(i), 1);
        } else {
          ransomNoteMap.put(ransomNote.charAt(i), r + 1);
        }
      }

      Integer m = magazineMap.get(magazine.charAt(i));
      if (m == null) {
        magazineMap.put(magazine.charAt(i), 1);
      } else {
        magazineMap.put(magazine.charAt(i), m + 1);
      }
    }

    for (Map.Entry<Character, Integer> ransomNoteEntry :
         ransomNoteMap.entrySet()) {
      Integer count = magazineMap.get(ransomNoteEntry.getKey());
      if (count == null || count < ransomNoteEntry.getValue()) {
        return false;
      }
    }
    return true;
  }
}