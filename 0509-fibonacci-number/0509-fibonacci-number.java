
class Solution {
    int fib(int n) {
        if(n == 0 || n == 1){ 
        return n ;
    }
    int a = 0;
    int b = 1;
    int sum = 0;
    for(int i = 2; i<=n; i=i+1){
        sum = a + b;
        a = b;
        b = sum;
    }
    return sum;

        
    }
};

//ye normal hai jo basic hai febbonachi ka 