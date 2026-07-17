class Solution {
    public String trimTrailingVowels(String s) {
        //s = "abcdeio";
        int n = s.length();
        int count =0; //3
        String Vowels ="aeiou";
        for(int i= n-1; i>=0; i--){
            char ch = s.charAt(i); //ch= d
            if(Vowels.indexOf(ch) != -1)count++;
            else break;
        }
        return s.substring(0, n-count);
    }
}