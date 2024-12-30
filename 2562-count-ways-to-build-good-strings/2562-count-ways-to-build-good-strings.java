class Solution {
    long mod = 1000000007;
    long [] dp ; 
    public int countGoodStrings(int low, int high, int zero, int one) {
       long sum = 0 ; 
       dp = new long[high+1] ; 
       Arrays.fill(dp,-1);
       for(int i = high ;i>=low  ; i--){
        sum = (sum+get(i,zero,one))%mod ;
       }
       return (int)sum; 
    }
    public long get(int l ,int z , int o){
        if(l==0){
            return 1 ; 
        }
        if(l<0){
            return 0 ;
        }
        if(dp[l]!=-1){
            return dp[l] ; 
        }
           long x = get(l-z,z,o) ;
           long y = get(l-o,z,o) ; 
           return dp[l]=(x+y)%mod ;
    }
}