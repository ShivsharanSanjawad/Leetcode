class Solution {
    public int searchInsert(int[] a, int target) {
        int s = 0 ; 
        int e = a.length -1 ; 
        int ans = e+1 ; 
        while(e>=s){
            int mid = s + ((e-s)>>1) ; 
            if(a[mid]>=target){
                ans = mid ; 
                e = mid -1 ;
            }else s = mid+1 ;  
        }
        return ans;
    }
}