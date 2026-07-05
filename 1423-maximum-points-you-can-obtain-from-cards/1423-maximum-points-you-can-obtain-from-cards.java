class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int [] arr = cardPoints;
        int n = arr.length;
        int lsum = 0;
        int max = Integer.MIN_VALUE;
        //first ke ele
        for(int i =0; i<k; i++){
            lsum = lsum + arr[i];
        }
        max = lsum;
        int rsum = 0;
        int li = n -1;
        for(int i = k-1; i>=0; i--){
            //shrik
            lsum = lsum - arr[i];
            rsum = rsum + arr[li];
            li--;
            max = Math.max(max, lsum+rsum);
        }
        return max;
    }
}