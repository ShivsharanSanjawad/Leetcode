class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] p, int[][] q) {
        List<Boolean> answer = new ArrayList<>() ;
        boolean [][] pre = new boolean[n][n] ; 
        for(int i = 0 ; i<p.length;i++){
            int x = p[i][0] ; 
            int y = p[i][1] ; 
            pre[x][y] = true ;
        }
        for(int i = 0 ; i<n;i++){
            for(int j = 0 ;j<n;j++){
                for(int k = 0 ; k<n;k++){
                    if(pre[k][i]&&pre[i][j]){
                        pre[k][j] = true ;
                    }
                }
            }
        }
        for(int i =  0 ; i<q.length;i++){
            int x = q[i][0] ; 
            int y = q[i][1] ; 
            answer.add(pre[x][y]) ;
        }
        return answer ;
        
    }

}