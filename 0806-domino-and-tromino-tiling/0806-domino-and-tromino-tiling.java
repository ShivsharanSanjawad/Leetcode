class Solution {
    int mod = 1000000007;
    public int numTilings(int n) {
        if(n<=2){
            return n;
        }
        if(n==3){
            return 5 ;
        }
        int prev2 = 1 ; 
        int prev1 = 2 ; 
        int prev0 = 5 ;
        for(int i=0;i<n-2;i++){
            int x = ((2*prev0)%mod + prev2)%mod ; 
            prev2 = prev1 ; 
            prev1 = prev0 ; 
            prev0 = x ;
        }
        return prev1 ;
    }
}