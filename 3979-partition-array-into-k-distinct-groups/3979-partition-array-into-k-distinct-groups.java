class Solution {
    public boolean partitionArray(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>() ; 
        int max = 0 ; 
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1) ; 
            max = Math.max(max,h.get(nums[i])) ; 
        }   
        int groups = nums.length/k ; 
        if(groups<max||nums.length%k!=0){
            return false ; 
        }
        return true ;
    }
}