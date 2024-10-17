class Solution {
    public void perform(int []nums  , int s, int e ){
       while(e>s){
            int temp = nums[s] ; 
            nums[s++] =  nums[e];
            nums[e--] = temp ; 
       }
    }
    public void rotate(int[] nums, int k) {
        k = k %nums.length ;
        perform(nums,nums.length-k , nums.length-1);
        perform(nums ,0, nums.length-k-1);
        perform(nums,0,nums.length-1);
    }
}