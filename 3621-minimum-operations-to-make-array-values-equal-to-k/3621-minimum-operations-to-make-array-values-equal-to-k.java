class Solution {
    public int minOperations(int[] nums, int k) {
        HashMap<Integer,Integer> h =new HashMap<>() ; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                return -1 ;
            }else if(nums[i]>k){
                h.put(nums[i],0) ;
            }
        }
        return h.size() ;
    }
}