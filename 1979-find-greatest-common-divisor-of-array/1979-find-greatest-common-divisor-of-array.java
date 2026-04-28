class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = nums[0]; // minimum
        int b = nums[n-1];
        int gcd = 1;
        for(int i =a; i>=1; i--){
            if( a % i == 0 && b % i == 0){
                return i;
            }

        }
        return 1;

    }
}