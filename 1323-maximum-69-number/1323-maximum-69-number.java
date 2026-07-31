class Solution {
    public int maximum69Number (int num) {
        int rev =0;
        while(num > 0){
            int Id = num % 10;
            rev = rev * 10 +Id;
            num = num/10;
        }
        int rev1 =0;
        int c6 =0;
        while(rev > 0){
            int Id = rev % 10;
            if(Id == 6 && c6 < 1){
                c6++;
                Id = 9;
            }
            rev1 = rev1 * 10 + Id;
            rev = rev /10;
        }
        return rev1;
    }
}