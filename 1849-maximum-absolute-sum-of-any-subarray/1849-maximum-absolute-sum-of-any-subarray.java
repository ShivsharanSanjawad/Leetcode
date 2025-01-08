class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0 ; 
        int min = 0 ; 
        int curr = 0 ;
        for(int i = 0 ; i<nums.length;i++){
            curr +=nums[i] ; 
            if(curr>max){
                max = curr ;
            }
            if(curr<min){
                min = curr ;
            }
        }   
        return Math.abs(max-min);
    }
}