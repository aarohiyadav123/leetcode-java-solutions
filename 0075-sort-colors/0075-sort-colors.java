class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int res[] = new int [n];
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                res[j]=0;
                j++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                res[j]=1;
                j++;
            }

        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==2){
                res[j]=2;
                j++;
            }
        }
        for(int i=0; i<nums.length;i++){
            nums[i]=res[i];
        }
    }
}