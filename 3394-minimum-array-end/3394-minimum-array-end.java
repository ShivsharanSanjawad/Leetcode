class Solution {
    public static long minEnd(int n, int x) {
        long ans = x ; 
        long temp = ans ; 
        long y = n-1 ;
        while(y>0){
        long bit = y&1 ; 
        long mask = ~temp&(temp+1) ; 
            if(bit==1){
                ans = ans|mask ;
            }
            temp = temp |mask ;
            y = y>>1 ;
        }
        return ans;
             
    }
}