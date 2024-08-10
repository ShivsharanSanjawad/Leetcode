class Solution {
    public int thirdMax(int[] nums) {
        boolean flag = true ;
        if(nums.length<3){
            Arrays.sort(nums) ; 
            return nums[nums.length-1] ;
        }
        int max = Integer.MIN_VALUE ;
        int max2 = Integer.MIN_VALUE ; 
        int max3 = Integer.MIN_VALUE; 
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==Integer.MIN_VALUE)
            flag = false ;
            if(nums[i]>max){
                max3 = max2 ; 
                max2 = max ; 
                max = nums[i] ;
            }
            else if(nums[i]>max2&&nums[i]!=max){
                max3 = max2 ; 
                max2 = nums[i] ;
            }else if(nums[i]>max3&&nums[i]!=max2&&nums[i]!=max){
                max3 = nums[i] ;
            }
        }
        if(max3==Integer.MIN_VALUE&&flag){
            return max ;
        }
        if(max2==Integer.MIN_VALUE&&flag){
            return max ;
        }
        if(max2==max3){
            return max ;
        }
        return max3 ;
    }
}