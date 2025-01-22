class Solution {
    int m  ;
    int n  ;
    public boolean ok(int p ,int q){
        return p>=0&&p<m&&q>=0&&q<n;
    }
    public int[][] highestPeak(int[][] isWater) {
        this.m = isWater.length ;
        this.n = isWater[0].length ;
        Queue<int[]>que = new LinkedList<>() ; 
        for(int i = 0 ; i<isWater.length;i++){
            for(int j = 0 ;j<isWater[0].length;j++){
                if(isWater[i][j]==1){
                    que.add(new int[]{i,j});
                    isWater[i][j] = 0 ;
                }else isWater[i][j] = -1 ;
            }
        }
        int x[] = {0,0,1,-1} ; 
        int y[] = {1,-1,0,0} ;
        while(!que.isEmpty()){
            int m[] = que.poll() ; 
            for(int i =0  ;i<4;i++){
                int p = m[0]+x[i] ;
                int q = m[1]+y[i] ;
                if(ok(p,q)&&isWater[p][q]==-1){
                    isWater[p][q] = isWater[m[0]][m[1]]+1;
                    que.add(new int[]{p,q}) ;
                }
            }
        }
        return isWater;
    }
}