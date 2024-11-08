class Solution {
    public int[] getMaximumXor(int[] nums, int m) {
        int x = (1<<m) - 1 ;
        int [] prefix = new int[nums.length] ; 
        int xor = 0 ; 
        for(int i = 0 ; i<nums.length;i++){
            xor = xor^nums[i] ; 
            prefix[nums.length-1-i] = xor ;
        }
        for(int i = 0 ;i<nums.length;i++){
            nums[i] = prefix[i]^x ;
        }
        return nums ;
    }
}