class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = values[0] ; 
        int maxscore = Integer.MIN_VALUE ; 
        for(int i = 1 ; i<values.length;i++){
            int x=  values[i] - i ; 
            maxscore = (int)Math.max(maxscore , x+max) ;
            max  = (int)Math.max(max, values[i] + i) ; 
        }
        return maxscore ;
    }
}