class Solution {
    int a[] ;
     int x = 0 ; 
    public int get(){
        return a[x++] ; 
    }
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length){
            return new int [][]{} ; 
        }
        this.a = original ; 
        int ans [][] = new int[m][n] ; 
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
              
                ans[i][j] = get() ; 
            }
        }
        return ans ; 

    }
}