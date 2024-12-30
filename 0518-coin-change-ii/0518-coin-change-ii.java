class Solution {
    int [][] dp ;
    public int change(int amount, int[] coins) {
        dp = new int[amount+1][coins.length] ; 
        for(int i = 0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return get(amount , coins,0) ; 
    }
    public int get(int amount, int []coins,int i ){
      if(amount==0){
        return 1;
      }
      if(amount<0){
        return 0 ; 
      }
      if(i>=coins.length){
        return amount==0?1:0 ;
      }
      if(dp[amount][i]!=-1){
        return dp[amount][i] ;
      }
        int x = get(amount,coins,i+1)+get(amount-coins[i],coins,i) ;
        return dp[amount][i] =x;
    }
}