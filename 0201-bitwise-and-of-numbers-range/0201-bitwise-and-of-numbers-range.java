class Solution {
   public static int log2(int a){
           return (int)(Math.log10(a)/Math.log10(2)) ;
    }
    public   int rangeBitwiseAnd(int left, int right) {
        if(left==0)
        return 0 ;
        if(log2(left)<log2(right)){
            return 0 ;
        }
        long ans = ~0 ; 
        if((left&(left-1))==0){
            return left ;
        }
        for(long i = left  ;i<=right;i++){
            ans = ans &i ;
        }
        return (int)ans ;
    }
}