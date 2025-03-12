class Solution {
    public int lowerBound(int [] nums){
        int s = 0 ; 
        int e = nums.length-1 ; 
        int ans = -1 ;
        while(e>=s){
            int mid = s + (e-s)/2 ; 
            if(nums[mid]>=0){
                ans = mid ;
                e = mid -1 ; 
            }else s = mid+1 ;
        }
        return ans ;
    }
     public int upperBound(int [] nums){
        int s = 0 ; 
        int e = nums.length-1 ; 
        int ans = -1 ;
        while(e>=s){
            int mid = s + (e-s)/2 ; 
            if(nums[mid]>0){
                ans = mid ;
                e = mid -1 ; 
            }else s = mid+1 ;
        }
        return ans ;
    }
    public int maximumCount(int[] nums) {
        int x = lowerBound(nums) ; 
        int y = upperBound(nums) ;
        System.out.println(x+" "+y+" "+nums.length); 
        if(x==-1&&y==-1) return nums.length;
        if(y==-1) y = nums.length ;
        return Math.max(x,nums.length-y);
    }
}