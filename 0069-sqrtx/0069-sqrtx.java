class Solution {
    public int mySqrt(int x) {
        if(x<2)
        return  x;
        long s = 0 ;
        long e = x- 1; 
        int ans=0 ;
        while(e>=s){
            long mid= s + (e-s)/2 ; 
            if(mid*mid==x){
                return (int)mid ;
            }else if(mid*mid<x){
                s = mid + 1;
                ans = (int)mid ;
            }else{
                e = mid -1 ;
            }
        }
        return ans; 
    }
}