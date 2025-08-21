class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0 ; 
        int zero = 0 ; 
        int s = 0 ; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++ ; 
            }
            while(zero>k){
                if(nums[s]==0){
                    zero-- ; 
                }
                s++ ; 
            }
            max = Math.max(i-s+1,max);
        }
        return max ;
    }
}