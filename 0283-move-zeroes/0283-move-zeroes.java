class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1)
        return ;
        int i = 0 ; 
        int j = 0; 
        while(j<nums.length){
            if(i<nums.length){
              if(nums[i]==0){
                    while(j<nums.length&&nums[j]==0){
                        j++ ;
                    }if(j!=nums.length){
                    nums[i] = nums[j] ;
                    nums[j] = 0 ;
                    }

              }
              i++ ; 
              if(j<i){
                j= i; 
              }
            }
        }
        for( ; i<nums.length ; i++){
            nums[i] = 0 ;
        }
    }
}