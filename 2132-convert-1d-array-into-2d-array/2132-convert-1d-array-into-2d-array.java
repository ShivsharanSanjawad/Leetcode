class Solution {
    
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length){
            return new int [][]{} ; 
        }
        int x = 0 ; 
        int ans [][] = new int[m][n] ; 
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
              
                ans[i][j] = original[x++] ; 
            }
        }
        return ans ; 

    }
}