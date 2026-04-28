class Solution {
    public int lengthOfLastWord(String s) {
       String ns = s.trim();
       int n = ns.length() ;
       int count = 0;
       for(int i = n-1; i>=0; i=i-1){
       if(ns.charAt(i) !=' '){
        count = count + 1;
       }
       else{
        break;
    }
}
return count;
    }
}