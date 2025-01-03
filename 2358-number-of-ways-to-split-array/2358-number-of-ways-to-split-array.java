class Solution {
    public int waysToSplitArray(int[] nums) {
        long [] prefix = new long[nums.length+1] ; 
        for(int i = 0 ;i<nums.length;i++){
            prefix[i+1] = prefix[i] + nums[i] ;
        }
        int count = 0 ;
        for(int i = 0 ;i<nums.length-1;i++){
            if(prefix[i+1]>=(prefix[prefix.length-1]-prefix[i+1])){
                count++ ;
            }
        }
        return count ;
    }
}