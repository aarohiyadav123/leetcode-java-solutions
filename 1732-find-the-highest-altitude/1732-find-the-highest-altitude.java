class Solution {
    public int largestAltitude(int[] gain) {
      int maxA = 0;
      int n = gain.length;
      int sum =0;
      for(int i =0; i<n; i++){
        sum = sum + gain[i];
        maxA = Math.max(maxA, sum);
      }
      return maxA;
    }
}