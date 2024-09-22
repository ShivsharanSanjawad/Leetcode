class Solution {
   public int get(long curr , int n){
        long count = 0 ; 
        long next = curr+1  ; 
        while(curr<=n){
            count += Math.min(next ,n+1) - curr ; 
            curr *=10 ; 
            next *=10 ; 
        }
        return (int)count ; 
   }
    public int findKthNumber(int n, int k) {
        long curr  = 1 ;
        k-- ;
        while(k>0){
            int x= get(curr,n) ;
            if(x<=k){
                k = k-x ; 
                curr++ ;
            }else {
                curr = curr*10 ;
                k-- ;
            } 
        }
        return (int)curr ;
    }
}