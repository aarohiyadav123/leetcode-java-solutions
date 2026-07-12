class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int  n= nums.length;
        int left = 0;
        int currPro =1;
        int count =0;
        for(int right =0;  right<n; right++){
            currPro = currPro * nums[right];
        while(currPro >= k){
            currPro = currPro / nums[left];
            left++;

        }
       count= count + (right-left +1);
    }
    return count;
    }
}
