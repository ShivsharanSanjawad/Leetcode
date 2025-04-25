class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>() ; 
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],0) ; 
        }
        int count = 0 ; 
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> h2 = new HashMap<>() ; 
            for(int j=i;j<nums.length;j++){
                h2.put(nums[j],0) ; 
                if(h2.size()==h.size()){
                    count++ ; 
                }
            }
        }
        return count;
    }
}