class Solution {
    public int bfs(int a[][],int k){ 
       Queue<Integer> q = new LinkedList<>() ; 
       q.add(k) ; 
       int distance[] = new int [a.length] ;
       distance[0] = 0 ; 
       boolean visited [] = new boolean[a.length];
       visited[0] = true ;
       while(!q.isEmpty()){
        int j = q.remove() ;
            for(int i = 0 ; i<a.length;i++){
                if(a[j][i]==1&&!visited[i]){
                    q.add(i);
                    visited[i] = true ;
                    distance[i] = distance[j] +1 ; 
                }
            }
       }
       return distance[a.length-1];
    }
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int a[][] = new int[n][n] ; 
        for(int i = 0 ; i<n-1 ; i++){
            a[i][i+1] = 1; 
        }   
        int ans[] = new int[queries.length] ; 
        for(int i = 0;i<queries.length;i++){
            a[queries[i][0]][queries[i][1]] =1 ; 
            ans[i] = bfs(a,0) ;
        }   
        return ans ;
    }
}