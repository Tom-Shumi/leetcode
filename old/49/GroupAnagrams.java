class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> result = new ArrayList<>();

    if (strs.length == 1) {
      List<String> list = Arrays.asList(strs[0]);
      result.add(list);

      return result;
    }

    Map<String, List<String>> map = new HashMap<>();

    for (String s : strs) {
      char[] charArr = s.toCharArray();
      Arrays.sort(charArr);
      String sortedStr = new String(charArr);

      List<String> list = map.get(sortedStr);
      if (list == null) {
        List<String> mappingList = new ArrayList<>();
        mappingList.add(s);
        map.put(sortedStr, mappingList);
        result.add(mappingList);
      } else {
        list.add(s);
      }
    }

    return result;
  }
}