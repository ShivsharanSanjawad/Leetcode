class Solution {
    public int get(int []nums,int i,int xor){
        if(i>=nums.length){
            return xor  ; 
        }
        int choose = get(nums,i+1,xor^nums[i]) ;
        int nonChoose = get(nums,i+1,xor) ; 
        return choose+nonChoose ;
    }
    public int subsetXORSum(int[] nums) {
        return get(nums,0,0) ;
    }
}