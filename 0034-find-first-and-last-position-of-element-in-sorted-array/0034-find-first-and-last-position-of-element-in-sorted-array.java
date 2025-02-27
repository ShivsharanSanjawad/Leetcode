class Solution {
    public int[] searchRange(int[] a, int target) {
        int s = 0 ; 
        int e = a.length-1 ; 
        int ans = -1 ; 
        while(e>=s){
            int mid = s + ((e-s)>>1) ; 
            if(a[mid]==target){
                ans = mid ; 
                e = mid-1 ;
            }else 
            if(a[mid]>target){
                e  = mid-1 ;
            }else s = mid+1 ;
        }
        s = 0 ; 
        e = a.length -1 ; 
        int ans2 = -1 ; 
        while(e>=s){
            int mid = s + ((e-s)>>1) ; 
            if(a[mid]==target){
                ans2 = mid ; 
                s = mid+1 ;
            }else 
            if(a[mid]>target){
                e  = mid-1 ;
            }else s = mid+1 ;
        }
        return new int[]{ans,ans2} ;
    }
}