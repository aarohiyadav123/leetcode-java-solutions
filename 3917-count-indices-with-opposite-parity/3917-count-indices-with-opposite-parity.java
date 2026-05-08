class Solution {
    public int countParity(int x, int[]nums, int i){
    int count =0;
    int n = nums.length;
    if(x % 2 == 0){
        for(int j = i+1; j<n; j++){
            if(nums[j] % 2 != 0){
                count++;
            }
        }
    }
    else{
        for(int j = i+1; j<n; j++){
            if(nums[j] % 2 ==0){
                count++;
            }
        }
    }
    return count; // o(n)tc
    //o(n)2time
}
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[]  res = new int[n]; 
        for(int i =0; i<n; i++){
            res[i]= countParity(nums[i] , nums, i);

            }
        
      return res;  
    }
}
