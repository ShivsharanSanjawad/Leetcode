class Solution {
    HashMap<Integer,Integer> h ;
    int dp[][] ;
    public boolean get(int []stones , int n,int k ){
        if(n==stones[stones.length-1]){
            return true ;
        }
        if(n>stones[stones.length-1]){
            return false ;
        }
        if(k<=0){
            return false ;
        }
        if(!h.containsKey(n)){
            return false ;
        }
        if(dp[h.get(n)][k]!=-1){
            return dp[h.get(n)][k]==1;
        }
     
        boolean x = get(stones,n+k-1,k-1) ;
        boolean y = get(stones,n+k,k);
        boolean z = get(stones,n+k+1,k+1);
        dp[h.get(n)][k] = z||y||x ?1:0  ;
        return dp[h.get(n)][k]==1 ;
    }
    public boolean canCross(int[] stones) {
        dp = new int[2001][2001];
        for(int i =0 ;i<2001;i++){
            Arrays.fill(dp[i],-1);
        }
        h = new HashMap<>() ; 
        for(int i =1; i<stones.length ; i++){
            h.put(stones[i],i);
        }
        return get(stones,1,1);
    }
}