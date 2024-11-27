class Solution {
    int [] dp  ;
    public int bfs(int a[][],int k){ 
        if(k==a.length-1){
            return 0 ; 
        }
        if(dp[k]!=-1){
            return dp[k] ; 
        }
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i<a.length ;i++){
            if(a[k][i]==1){
                int y  = bfs(a,i) +1; 
                
                min = Math.min(y,min) ;
            }
        }
        dp[k] = min ; 
        return min ; 
    }
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int a[][] = new int[n][n] ; 
        for(int i = 0 ; i<n-1 ; i++){
            a[i][i+1] = 1; 
        }   
        dp = new int[n]; 
        Arrays.fill(dp,-1);
        int ans[] = new int[queries.length] ; 
        for(int i = 0;i<queries.length;i++){
            a[queries[i][0]][queries[i][1]] =1 ; 
            ans[i] = bfs(a,0) ;
            Arrays.fill(dp,-1);
        }   
        return ans ;
    }
}