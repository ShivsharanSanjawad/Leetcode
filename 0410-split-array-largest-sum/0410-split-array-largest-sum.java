class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0 ; 
        int e = Integer.MAX_VALUE ; 
        int ans = e ; 
        while(e>=s){
            int mid = s + (e-s)/2 ; 
            if(get(mid, nums,k)){
                ans = mid ; 
                e = mid -1 ;
            }else s = mid+1 ;
        }
        return ans ;
    }
    public boolean get(int mid , int w[] , int d){
        int days = 1 ; 
        int sum = 0  ; 
        for(int i=0;i<w.length;i++){
            if(w[i]>mid){
              return false ;
            }
            if((sum+w[i])>mid){
                sum =  0 ; 
                days++ ; 
            }
            sum +=w[i] ;
        }
        if(sum>mid){
            days++ ; 
        }
        return days<=d  ; 
    }
}