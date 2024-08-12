int findPeakElement(int* nums, int numsSize) {
     int s  = 0 ; 
        int e = numsSize -1 ; 
        while(e>s){
            int mid = s + (e-s)/2 ; 
            if(nums[mid]>=nums[mid+1]){
                e = mid;
            }else{
                if(nums[mid]<=nums[mid+1]){
                    s = mid+1 ;
                }
            }
            
        }
        return s ;
}