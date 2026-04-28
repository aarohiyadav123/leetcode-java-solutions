class Solution {
    public int maximumGap(int[] nums) {
       int diff = 0;
       int maxdiff = 0;
       Arrays.sort(nums);
       if(nums.length<2){
        return 0;
       }
       if(nums.length==2){
        diff=nums[1]-nums[0];


        return Math.abs(diff);
       } 
       
       for(int i=0; i<nums.length-1; i++){
        diff=nums[i+1]-nums[i];
        maxdiff=Math.max(diff,maxdiff);
       }
       diff=nums[nums.length-1]-nums[nums.length-2];
       maxdiff=Math.max(diff,maxdiff);
       return Math.abs(maxdiff);
    }
}