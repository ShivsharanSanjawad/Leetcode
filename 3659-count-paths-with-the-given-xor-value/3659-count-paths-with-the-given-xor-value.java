class Solution {
    long mod = 1000000007;
    HashMap<Long,Long> dp ;
    public int countPathsWithXorValue(int[][] grid, int k) {
        dp = new HashMap<>();
        return (int)get(grid,k,0,0,grid[0][0]) ;
    }
    public long get(int [][]grid,int k,int i,int j,int xor){
        int m = grid.length ;
        int n = grid[0].length ;
        long x = ((long)i<<13) | ((long)j<<4) | (xor);
        if(dp.containsKey(x)){
            return dp.get(x) ;
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
        dp.put(x,ways) ;
        return ways ;
    }
}