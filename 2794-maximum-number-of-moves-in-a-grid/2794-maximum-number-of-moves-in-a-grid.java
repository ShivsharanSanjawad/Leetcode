class Solution {
    int [][] dp ;
    public int get(int r , int c , int [][]grid){
        if(r>=grid.length||c+1>=grid[0].length||r<0){
            return 0 ; 
        }
        if(dp[r][c]!=-1){
            return dp[r][c] ;
        }
        int x =0 , y=0,z=0 ;
        if(r+1<grid.length)
        x = grid[r][c]<grid[r+1][c+1]?1 + get(r+1,c+1,grid):0;
        if(r-1>=0)
        y = grid[r][c]<grid[r-1][c+1]?1 +get(r-1,c+1,grid):0;
        z = grid[r][c]<grid[r][c+1]?1 +get(r,c+1,grid):0;
        dp[r][c] =   Math.max(Math.max(x,y),z);
        return dp[r][c] ;
    }

    public int maxMoves(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        for(int i = 0 ; i<grid.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int max = -1 ;
        for(int i = 0 ;i<grid.length;i++){
            int x = get(i,0,grid) ;
            if(x>max){
                max = x ;
            }
        }
        return max ;
    }
}