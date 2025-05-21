class Solution {
    long mod = 1000000007;
    long[][][]dp;
    public int countPathsWithXorValue(int[][] grid, int k) {
        int m = grid.length ;
        int n = grid[0].length ;
        dp = new long[m][n][16] ;
        for(int i=0;i<16;i++){
            dp[m-1][n-1][i] = (i==k)?1:0 ; 
        }
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1&&j==n-1) continue ;
                for(int xor=0;xor<16;xor++){
                    long ways = 0 ; 
                    if(i+1<m){
                        ways = (ways+ dp[i+1][j][xor^grid[i+1][j]])%mod ;
                    }
                    if(j+1<n){
                        ways = (ways + dp[i][j+1][xor^grid[i][j+1]])%mod ;
                    }
                    dp[i][j][xor] = ways ;
                }
            }
        }
        return (int)dp[0][0][grid[0][0]];
    }
}