class Solution {
    public int singleNumber(int[] nums) {
        
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            int num = nums[i];
        for(int j = 0; j<n; j++){
            if(num == nums[j]){
                count++;
        }
        }
        if(count == 1){
            return nums[i];
        }
        else{
            count = 0;
    }
}
return 0;
    }
}