class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1)
        return nums[0] ;
        int []ans = new int[nums.length/2] ; 
       int i = 0 ; 
       int j = 0 ; 
       while(i<nums.length){
        ans[j++] = Math.min(nums[i],nums[i+1]) ; 
        i = i + 2 ; 
        if(i<nums.length)
        ans[j++] = Math.max(nums[i],nums[i+1]) ; 
        i = i+2 ;
       }

       return minMaxGame(ans) ;
    }
}