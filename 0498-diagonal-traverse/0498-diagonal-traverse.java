class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length ; 
        int n = mat[0].length ; 
        int a[]= new int[m*n] ; 
        int x = 0 ; 
        int k = 0 ; 
        for(int i=0;i<m+n-1;i++){
            if(k%2==0){
                int p = Math.min(i,m-1); 
                int q = i-p ; 
                while(q!=Math.min(i+1,n)){
                    a[x++] = mat[p][q] ; 
                    p-- ; 
                    q++ ; 
                }
            }else{
                int q = Math.min(i,n-1) ; 
                int p = i-q ;
                while(p!=Math.min(i+1,m)){
                    a[x++] = mat[p][q] ; 
                    p++ ; 
                    q-- ; 
                }
            }
            k++ ; 
        }
        return a ; 
    }
}