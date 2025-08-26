class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int maxD = 0 ; 
        int maxA = 0 ; 
        for(int i =0;i<d.length;i++){
            int l = d[i][0] ; 
            int w = d[i][1] ; 
            int di = l*l + w*w ; 
            if(di>maxD){
                maxD = di ; 
                maxA = l*w ; 
            }else if(di==maxD){
                maxA = Math.max(l*w,maxA) ;
            } 
        }
        return maxA ;  
    }
}