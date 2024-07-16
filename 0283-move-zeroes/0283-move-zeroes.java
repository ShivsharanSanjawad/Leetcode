class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1)
        return ;
        int i = 0 ; 
        int j = 1; 
        while(i<nums.length){
            if(nums[i]==0){
                while(j<nums.length&&nums[j]==0){
                    j++ ;
                }
                if(j!=nums.length){
                     int temp = nums[i] ; 
                     nums[i] = nums[j] ; 
                    nums[j] = temp ;
                }
               
                
            }
             i++ ;
                j= i+1 ;
        }
    }
}