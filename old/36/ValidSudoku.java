class Solution {
  public boolean isValidSudoku(char[][] board) {

    Map<Integer, Set<Character>> map = new HashMap<>();

    Set<Character> set0 = new HashSet<>();
    Set<Character> set1 = new HashSet<>();
    Set<Character> set2 = new HashSet<>();
    Set<Character> set3 = new HashSet<>();
    Set<Character> set4 = new HashSet<>();
    Set<Character> set5 = new HashSet<>();
    Set<Character> set6 = new HashSet<>();
    Set<Character> set7 = new HashSet<>();
    Set<Character> set8 = new HashSet<>();

    map.put(0, set0);
    map.put(1, set1);
    map.put(2, set2);
    map.put(3, set3);
    map.put(4, set4);
    map.put(5, set5);
    map.put(6, set6);
    map.put(7, set7);
    map.put(8, set8);

    //---------------------------------------------------

    Set<Character> setArea0 = new HashSet<>();
    Set<Character> setArea1 = new HashSet<>();
    Set<Character> setArea2 = new HashSet<>();
    Set<Character> setArea3 = new HashSet<>();
    Set<Character> setArea4 = new HashSet<>();
    Set<Character> setArea5 = new HashSet<>();
    Set<Character> setArea6 = new HashSet<>();
    Set<Character> setArea7 = new HashSet<>();
    Set<Character> setArea8 = new HashSet<>();

    //---------------------------------------------------
    Map<String, Set<Character>> mapArea = new HashMap<>();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 9; j++) {
        if (j == 0 || j == 1 || j == 2) {
          mapArea.put("" + i + j, setArea0);
        } else if (j == 3 || j == 4 || j == 5) {
          mapArea.put("" + i + j, setArea1);
        } else {
          mapArea.put("" + i + j, setArea2);
        }
      }
    }
    for (int i = 3; i < 6; i++) {
      for (int j = 0; j < 9; j++) {
        if (j == 0 || j == 1 || j == 2) {
          mapArea.put("" + i + j, setArea3);
        } else if (j == 3 || j == 4 || j == 5) {
          mapArea.put("" + i + j, setArea4);
        } else {
          mapArea.put("" + i + j, setArea5);
        }
      }
    }
    for (int i = 6; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (j == 0 || j == 1 || j == 2) {
          mapArea.put("" + i + j, setArea6);
        } else if (j == 3 || j == 4 || j == 5) {
          mapArea.put("" + i + j, setArea7);
        } else {
          mapArea.put("" + i + j, setArea8);
        }
      }
    }

    for (int i = 0; i < 9; i++) {
      Set<Character> set = new HashSet<>();

      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {
          continue;
        }
        //---------------------------------------------------
        if (set.contains(board[i][j])) {
          return false;
        }
        set.add(board[i][j]);
        //---------------------------------------------------
        Set<Character> jSet = map.get(j);
        if (jSet.contains(board[i][j])) {
          return false;
        }
        jSet.add(board[i][j]);
        map.put(j, jSet);
        //---------------------------------------------------
        String key = "" + i + j;
        Set<Character> setArea = mapArea.get(key);
        if (setArea.contains(board[i][j])) {
          return false;
        }
        setArea.add(board[i][j]);
        mapArea.put(key, setArea);
      }
    }

    return true;
  }
}