class Solution {
    public int maxAbsoluteSum(int[] nums) {
         long max = Integer.MIN_VALUE ; 
         long min = Integer.MAX_VALUE ; 
         long curr = 0 ;
         for(int i = 0 ; i<nums.length;i++){
            curr +=nums[i];
            if(curr>max){
                max = curr ;
            }
            if(curr<min){
                min = curr ;
            }
         }
         return (int)Math.max(Math.max(Math.abs(max),Math.abs(min)),Math.abs(max-min));
        
    }
}