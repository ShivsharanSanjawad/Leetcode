class Solution {
    public int missingNumber(int[] nums) {
           long sum  = 0 ; 
           for(int i = 0 ;i<nums.length ; i++){
            sum = sum+ nums[i] ;
           }
           return (int) ((nums.length+1)*(nums.length)/2  -sum);
    }
}