class Solution {
    int [][] dp ;
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length+1][nums.length+2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return get(nums,0,-1);
    }
    public int get(final int[]a,int i,int prev){
        if(i==a.length){
            return 0 ;
        }
        if(dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }
        int x = -1 ; 
        int y = -1 ;
        if(prev<0||a[i]>a[prev]){
            x = 1+get(a,i+1,i);
        }
        y = get(a,i+1,prev);
        return dp[i][prev+1] = Math.max(x,y);
    }
}