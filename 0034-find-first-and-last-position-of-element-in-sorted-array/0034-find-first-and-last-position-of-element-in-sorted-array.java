class Solution {
   public int get(int []nums , int target , boolean start){
    int s =  0  ; 
    int e = nums.length -1 ;
    int ans  = -1 ;
    while(e>=s){
        int mid = s +(e-s)/2 ; 
        if(nums[mid]>target){
            e = mid- 1 ;
        }else if (nums[mid]<target){
            s = mid + 1 ;
        }
        else if(nums[mid]==target){
            ans = mid ; 
            if(start){
                e = mid - 1; 
            }else{
                s = mid + 1 ;
            }

        }
    }
    return ans ; 
   }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{get(nums,target,true),get(nums,target,false)} ;
    }
}