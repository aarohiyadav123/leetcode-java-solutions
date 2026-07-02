class Solution {
    public int longestPalindrome(String s) {
    int[] freq = new int[128];
    //count frequency if each character
    for( char ch : s.toCharArray()) {
        freq[ch]++;
    }

    int length = 0;
    for(int count : freq){
        //add even part
        length += (count / 2) * 2;
        // if length is even ans count is odd,
        // place one odd character in center

        if(length % 2 == 0 &&  count % 2 == 1){
            length++;
        }
    }
    return length;
    }
}