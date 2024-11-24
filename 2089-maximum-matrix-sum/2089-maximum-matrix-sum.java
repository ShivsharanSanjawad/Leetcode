class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        // for(int i = 0 ;i<matrix.length;i++){
        //     for(int j  = 0 ; j<matrix[0].length;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        ArrayList<Integer> ans = new ArrayList<>() ; 
        int a[] = new int[matrix.length] ;
        Arrays.fill(a,0);
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                if(matrix[i][j]<0){
                    a[i]++ ;
                    matrix[i][j] = -matrix[i][j] ;
                }
            }
        }
        int count = 0 ;
        for(int i = 0 ; i<matrix.length;i++){
            Arrays.sort(matrix[i]);
            a[i] = a[i]%2 ; 
            if(a[i]==1){
                count++ ;
            }
        }
        for(int i = 0 ; i<matrix.length ; i++){
                ans.add(matrix[i][0]);
            for(int j = 1 ; j<matrix[i].length ; j++){
               sum +=matrix[i][j] ;
            }
        }
        Collections.sort(ans) ; 
        if(ans.size()==0){
            return sum;
        }
        if(count%2==1){
            sum-=ans.get(0);
        }else{
            sum +=ans.get(0);
        }
        for(int i =1 ; i<ans.size();i++){
            sum+=ans.get(i);
        }






        // int x = a.size() ; 
        // if(a.size()%2!=0){
        //     x -- ;
        //     sum += a.get(a.size()-1);
        // }
        // for(int i  = 0 ; i<x ;i++){
        //     sum =sum - a.get(i);
        // }
        // for(int i = 0 ; i<a.size();i++){
        //     System.out.print(a.get(i)+" ");
        // }
        // System.out.println() ;
       
        return sum;
    }
}