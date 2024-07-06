class Solution {
    public  int passThePillow(int n, int time) {
        int i = 0 ;
        while(time>=n){
                time = time-n+1 ;
                i ++ ; 
        }
        if(i%2==0){
            return time+1;
        }
        return n-time ;
    }
}