class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        // for(int i = 0 ;i<matrix.length;i++){
        //     for(int j  = 0 ; j<matrix[0].length;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int count = 0 ; 
        int min = Integer.MAX_VALUE ;
        for(int i  = 0 ; i<matrix.length ;i++){
            for(int  j = 0 ; j<matrix[0].length ;j++){
                sum +=Math.abs(matrix[i][j]);
                if(matrix[i][j]<0){
                    count++ ;
                }
                if(Math.abs(matrix[i][j])<min){
                    min = Math.abs(matrix[i][j]) ;
                }
            }
        }
        if(count%2!=0){
            sum -=2*min ;
        }
        return sum;
    }
}