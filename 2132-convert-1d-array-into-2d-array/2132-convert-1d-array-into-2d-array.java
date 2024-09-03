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
        int z  = 0 ; 
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(z>=original.length){
                    return ans ; 
                }
                ans[i][j] = get() ; 
                z++ ; 
            }
        }
        return ans ; 

    }
}