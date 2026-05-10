class Solution {
    public int[] scoreValidator(String[] events) {
        int n = events.length;
        int[] res = new int[2];
        int score = 0;
        int count=0;
        for(int i =0; i<n; i++){
            String curr = events[i];
            if(count==10){
                break;
            }
            if(curr.equals("W")){
                count++;
            }
            else if(curr.equals("1")){
                score = score +1;
            }
            else if(curr.equals("2")){
                score = score +2;
            }
            else if(curr.equals("3")){
                score = score+3;
            }
            else if(curr.equals("3")){
                score = score+3;
            }
            else if(curr.equals("4")){
                score = score+4;
            }
            else if(curr.equals("6")){
                score = score+6;
            }
            else if(curr.equals("0")){
                score = score+0;
            }
            else{
                score++;
            }
        }
        res[0] = score;
            res[1] = count;
            return res;
    }
}


            