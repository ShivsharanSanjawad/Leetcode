class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int a[] = new int[arr.length] ; 
        a[0]   = arr[0]  ; 
        for(int  i= 1 ; i<arr.length ; i++ ){
            a[i] = arr[i]^a[i-1]; 
        }
        //System.out.println(Arrays.toString(a)) ;
        int []ans  = new int[queries.length] ; 
        for(int i = 0 ; i<queries.length ; i++){
            if(queries[i][0]!=0)
            ans[i] = a[queries[i][1]]^a[queries[i][0]-1] ; 
            else 
            ans[i] = a[queries[i][1]] ; 
        }
        return ans;
    }
}