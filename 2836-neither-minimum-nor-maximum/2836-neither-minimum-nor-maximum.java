class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3)
        return -1 ;
        Arrays.sort(nums);
        Random r = new Random() ; 
        int x = (int)r.nextDouble(1, nums.length-1) ;
        return nums[x] ;
    }
}