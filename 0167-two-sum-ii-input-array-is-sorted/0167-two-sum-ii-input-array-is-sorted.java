class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int low = 0;
        int high = n-1;
        int[] res = new int[2];
        while(low <high){
            // int mid=(low+high)/2;
            int sum = numbers[low] + numbers[high];
            if(sum == target){
                res[0] = low+1;
                res[1] = high+1;
                break;
            }
            else if(sum > target){
                high--;
        }
        else{
            low++;
        }
    }
return res;
}
}