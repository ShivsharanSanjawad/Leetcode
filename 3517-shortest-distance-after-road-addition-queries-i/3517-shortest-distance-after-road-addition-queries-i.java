class Solution {
    int [] dp  ;
    public int bfs(ArrayList<ArrayList<Integer>>a ,int k){ 
        if(k==a.size()-1){
            return 0 ; 
        }
        if(dp[k]!=-1){
            return dp[k] ; 
        }
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i<a.get(k).size() ;i++){
                int y  = bfs(a,a.get(k).get(i)) +1; 
                min = Math.min(y,min) ;
        }
        dp[k] = min ; 
        return min ; 
    }
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
       ArrayList<ArrayList<Integer>> a = new ArrayList<>() ; 
       for(int i = 0 ; i<n ; i++){
            a.add(new ArrayList<>()) ;
       }
       for(int i  = 0 ;i<n;i++){
        a.get(i).add(i+1) ;
       }
        dp = new int[n]; 
        Arrays.fill(dp,-1);
        int ans[] = new int[queries.length] ; 
        for(int i = 0;i<queries.length;i++){
           a.get(queries[i][0]).add(queries[i][1]);
            ans[i] = bfs(a,0) ;
            Arrays.fill(dp,-1);
        }   
        return ans ;
    }
}