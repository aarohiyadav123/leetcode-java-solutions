class Solution {
    public double minimumAverage(int[] nums) {
       int n = nums.length;
       Arrays.sort(nums);
       //two pointer + sorting
       double[] avg = new double[n/2];
       int i = 0;
       int  j = n-1;
       while(i<=(n/2)-1 && j>=(n/2)){
        avg[i] = (nums[i] + nums[n-i-1])/2.0;
        i++;
        j--;
       }
       Arrays.sort(avg);
       return avg[0];
    }
}