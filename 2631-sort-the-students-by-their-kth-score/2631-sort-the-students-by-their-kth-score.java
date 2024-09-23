class Solution {
    public int[][] sortTheStudents(int[][] scores, int k) {
        
        for(int i = 0 ; i<scores.length-1 ; i++){
            boolean flag = true ;
            for(int j = 0 ; j<scores.length-i-1; j++){
                if(scores[j][k]<scores[j+1][k]){
                    int temp[] = scores[j] ; 
                    scores[j] = scores[j+1] ; 
                    scores[j+1] = temp ; 
                    flag = false ;
                }
            }
            if(flag){
                break ;
            }
        }
        return scores ;
    }
}