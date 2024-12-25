class Solution {
    boolean [] visited  ;
    public int findCircleNum(int[][]m) {
        int count = 0 ; 
        visited = new boolean[m.length] ;
        for(int i = 0 ; i<m.length;i++){
            if(!visited[i]){
                count++ ; 
                bfs(m,i);
            }
        }
        return count ;
    }
    public void bfs(int [][]m , int y){
        Queue<Integer> q = new LinkedList<>() ; 
        q.add(y) ;
        while(!q.isEmpty()){
            int x = q.poll() ; 
            for(int i = 0 ;i<m.length;i++){
                if(m[x][i]==1&&!visited[i]){
                    q.add(i) ;
                    visited[i] = true ;
                }
            }
        }
    }
}