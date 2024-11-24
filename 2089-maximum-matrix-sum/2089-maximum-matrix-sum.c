long long maxMatrixSum(int** matrix, int matrixSize, int* matrixColSize) {
     long long sum = 0;
    
        int count = 0 ; 
        int min = INT_MAX;
        int x =*matrixColSize ;
        printf("%d",x);
        for(int i  = 0 ; i<matrixSize ;i++){
            for(int  j = 0 ; j<x ;j++){
                sum +=abs(matrix[i][j]);
                if(matrix[i][j]<0){
                    count++ ;
                }
                if(abs(matrix[i][j])<min){
                    min = abs(matrix[i][j]) ;
                }
            }
        }
        if(count%2!=0){
            sum -=2*min ;
        }
        return sum;
}