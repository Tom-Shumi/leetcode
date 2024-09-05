class RandomizedSet {

  Set<Integer> set;
  public RandomizedSet() { set = new HashSet<Integer>(); }

  public boolean insert(int val) { return set.add(val); }

  public boolean remove(int val) { return set.remove(val); }

  public int getRandom() {
    Random random = new Random();
    int index = random.nextInt(set.size());
    int i = 0;
    for (Integer num : set) {
      if (index == i) {
        return num;
      }
      i++;
    }
    return 0;
  }
}