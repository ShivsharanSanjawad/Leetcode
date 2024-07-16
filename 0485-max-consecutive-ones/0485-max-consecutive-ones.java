class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = -1 ;
        int c = 0 ;
         for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==1){
                c++ ;
            }
            if(nums[i]==0){
                if(max<c){
                    max =c ;
                }
                c = 0 ;
            }
           
         }
         if(max<c)
         max = c ;
         return max ;
    }
}