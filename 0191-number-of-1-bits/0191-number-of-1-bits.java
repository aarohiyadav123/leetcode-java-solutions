class Solution {
    public int hammingWeight(int n) {
    int m = n;
    int count =0;
    while(m>0){
        if(m%2 != 0){
            count++;
        }
        m = m/2;
    }
    return count;

    }
}