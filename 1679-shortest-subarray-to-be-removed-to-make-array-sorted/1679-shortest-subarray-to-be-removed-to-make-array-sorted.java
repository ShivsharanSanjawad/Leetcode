class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
       int ans = Integer.MAX_VALUE ; 
       int l = 0 ; 
       while(l<arr.length-1&&arr[l]<=arr[l+1]){
            l++ ;
       }
       if(l==arr.length-1){
            return 0 ;
       }
        int r = arr.length -1 ; 
        while(r>0 && arr[r]>=arr[r-1]){
            r-- ; 
        }
    
        ans = Math.min(r, arr.length -1-l); 
      //    System.out.println(r+" "+l +" "+ans) ; 
        for(int i = 0 ; i<=l ; i++){
            while(r<arr.length &&arr[r]<arr[i]){
                r++ ; 
            }
            if(r<arr.length){
                ans = Math.min(ans , r-i-1) ;
            }
        }
        return ans ;
    }
}