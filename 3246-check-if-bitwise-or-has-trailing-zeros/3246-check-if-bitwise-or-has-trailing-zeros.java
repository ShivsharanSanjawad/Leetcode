class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int x = 0 ; 
        for(int i = 0 ;i<nums.length ; i++){
            if((nums[i]&1)==0){
                x++ ;
            }
        }
        if(x>1){
            return true ;
        }
        return false ;
    }
}