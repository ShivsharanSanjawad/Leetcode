class Solution {
    int directions [][] = {{0,1},{1,0},{-1,0},{0,-1}} ;
    int m ; 
    int n ;
    public boolean valid(int x ,int y){
        return x>=0&&y>=0&&x<m&&y<n ;
    }
    public int minTimeToReach(int[][] moveTime) {
        PriorityQueue<int[]> q = new PriorityQueue<>((x,y)->Integer.compare(x[2],y[2])) ; 
        int [] a = new int[3] ; 
        m = moveTime.length ;
        n = moveTime[0].length ;
        boolean [][] visited = new boolean[m][n] ; 
        a[0] = 0 ; 
        a[1] = 0 ;
        a[2] = 0 ; 
        int cost = 0 ; 
        q.add(a);
        while(!q.isEmpty()){
            int b[] = q.poll() ;
            if(visited[b[0]][b[1]]){
                continue ;
            }
            visited[b[0]][b[1]] = true ;
            if(b[0]==m-1&&b[1]==n-1){
                return b[2] ;
            }
            int z = (b[0]+b[1])%2==1?1:0;   
            for(int d[]:directions){
                int x = b[0] + d[0] ; 
                int y = b[1] + d[1] ; 
                if(valid(x,y)){
                   int dist = Math.max(b[2],moveTime[x][y])+1+z;
                   q.add(new int[]{x,y,dist}) ;  
                }
            }
        }
        return -1 ;
    }
}