class Solution {
    long mod = 1000000007;
    long[][][]dp;
    public int countPathsWithXorValue(int[][] grid, int k) {
        dp = new long[grid.length+1][grid[0].length+1][17] ;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return (int)get(grid,k,0,0,grid[0][0]) ;
    }
    public long get(int [][]grid,int k,int i,int j,int xor){
        int m = grid.length ;
        int n = grid[0].length ;
        if(dp[i][j][xor]!=-1){
            return dp[i][j][xor];
        }
        if(i==(m-1)&&j==(n-1)){
            return xor==k?1:0 ; 
        }
        long ways = 0 ; 
        if(i+1<m){
            ways = (ways+ get(grid,k,i+1,j,xor^grid[i+1][j]))%mod ;
        }
        if(j+1<n){
            ways = (ways + get(grid,k,i,j+1,xor^grid[i][j+1]))%mod ;
        }
        dp[i][j][xor] = ways ;
        return ways ;
    }
}