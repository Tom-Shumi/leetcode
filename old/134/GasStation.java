class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int tank = 0;
    int start = 0;
    int current = 0;
    for (int i = 0; i < gas.length; i++) {
      current += (gas[i] - cost[i]);
      tank += (gas[i] - cost[i]);
      if (current < 0) {
        current = 0;
        start = i + 1;
      }
    }
    if (tank < 0) {
      return -1;
    }
    return start;
  }
}
