class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0 ; 
        int zero = 0 ; 
        int s = 0 ; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++ ; 
            }
            if(zero>1){
                while(zero>1){
                    if(nums[s]==0){
                        zero-- ; 
                    }
                    s++ ; 
                }
            }
            max = Math.max(max,i-s) ;
        }
        return max ; 
    }
}