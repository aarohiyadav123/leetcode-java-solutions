class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<k; i++){
            sum = sum + nums[i];
        }
        max = sum;
        for(int i = 1; i<=n-k; i++){
            //shrik by 1
            sum = sum - nums[i-1];
            //expand
            sum = sum + nums[i+k-1];
            //compute
            max = Math.max(max, sum);
        }
        return (double) max/k;
    }
}