class Solution {
    public int longestSubarray(int[] nums) {
      int max = 0 ; 
      for(int i = 0  ; i<nums.length; i++){
            if(max<nums[i]){
                max = nums[i] ; 
            }
      }
      int cmax = 0 ; 
      int count = 0 ; 
      for(int i = 0 ; i<nums.length ; i++){
        if(nums[i]==max){
            count ++ ; 
        }else {
            count = 0 ;
        }
        if(count>cmax){
            cmax = count ; 
        }
      }
      return cmax ; 
    }
}
