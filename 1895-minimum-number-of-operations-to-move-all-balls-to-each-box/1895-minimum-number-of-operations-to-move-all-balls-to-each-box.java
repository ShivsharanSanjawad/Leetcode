class Solution {
    public int[] minOperations(String s) {
        if(s.length()==0){
           return new int[0] ;
        }
        int n = s.length() ; 
        int []prefixOne = new int[n] ; 
        int []suffixOne = new int[n] ;
        int []prefixSum = new int[n] ; 
        int []suffixSum = new int[n] ; 
        prefixOne[0] = s.charAt(0)=='1'?1:0 ;
        prefixSum[0] = 0 ;
        for(int i = 1 ; i<n;i++){
            if(s.charAt(i)=='1'){
                prefixOne[i] = prefixOne[i-1]+1 ;
                prefixSum[i] = prefixSum[i-1]+i ;
            }else {
                prefixOne[i]=prefixOne[i-1] ;
                prefixSum[i] = prefixSum[i-1] ;
            }
        } 
        suffixOne[n-1] = s.charAt(n-1)=='1'?1:0 ;
        suffixSum[n-1] = s.charAt(n-1)=='1'?n-1:0;
        for(int i = n-2 ;i>=0;i--){
            if(s.charAt(i)=='1'){
                suffixOne[i] = suffixOne[i+1] +1 ; 
                suffixSum[i] = suffixSum[i+1] + i ; 
            }else{
                suffixOne[i] = suffixOne[i+1] ; 
                suffixSum[i] = suffixSum[i+1] ;
            }
        }
        int ans[] = new int[n] ; 
        for(int i = 0 ; i<n;i++){
            int x = prefixOne[i] ; 
            int y = suffixOne[i] ; 
            int temp1 = suffixSum[i] - i*y ; 
            int temp2 = i*x - prefixSum[i] ; 
            ans[i] = temp1+temp2 ;
        }
        return ans;
        
    }
}