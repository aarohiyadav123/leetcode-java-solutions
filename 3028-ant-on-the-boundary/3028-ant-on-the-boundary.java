class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n = nums.length;
        int [] pre = new int [n];
        int count=0;
        int sum = 0;
        for(int i =0; i<n; i++){
            sum = sum + nums[i];
            pre[i] = sum;
        }
        for(int i =0; i<n; i++){
            if(pre[i] == 0) count++;
        }
    
    return count;
}
}