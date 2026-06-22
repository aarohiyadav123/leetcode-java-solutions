class  Solution {
    public int fib(int n){
        if(n ==1) return 1;
        if(n == 0) return 0;
        int left = fib(n-1);
        int right = fib(n-2);
        return left+right;
        
    }
}
//fib ko recurion se slove kiya hai 