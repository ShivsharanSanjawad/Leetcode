class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        Arrays.sort(nums1) ; 
        Arrays.sort(nums2);
        long s = -1_000_000_000_0L;  // Safe lower bound
        long e = 1_000_000_000_0L;   // Safe upper bound
        long ans = s ;
        while(e>=s){
            long mid = s + (e-s)/2 ; 
            if(get(nums1,nums2,k,mid)){
                ans = mid ; 
                e = mid -1 ; 
            }else s = mid + 1; 
        }
        return ans ;
    }
    public static boolean get(int []nums1,int[]nums2, long k, long mid){
        long count = 0 ; 
        for(int i=0;i<nums1.length;i++){
            count += get2(nums2,nums1[i],mid);
        }
        return count>=k ;
    }
    public static int get2(int[]nums2,long x,long m){
        if(x==0){
            if(m>=0)
            return nums2.length ; 
            return 0 ; 
        }
        if(x>0){
            int s = 0 ; 
            int e = nums2.length -1 ; 
            int ans = -1 ;
            while(e>=s){
                int mid = s + (e-s)/2 ; 
                long product = (long)nums2[mid]*x ; 
                if(product<=m){
                    ans = mid ;
                    s = mid +1 ;
                }else e = mid -1 ;
            }
            return ans +1;
        }else {
            int s = 0 ;
            int e = nums2.length - 1; 
            int ans = e+1 ; 
            while(e>=s){
                int mid = s + (e-s)/2 ; 
                long product = (long)nums2[mid]*x ; 
                if(product<=m){
                    e = mid -1 ; 
                    ans = mid  ; 
                }else s = mid+1 ; 
            }
            return nums2.length - ans ;
        }
      
    }
}