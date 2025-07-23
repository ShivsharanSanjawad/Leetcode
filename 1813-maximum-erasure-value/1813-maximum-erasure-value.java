class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       int l = 0 ; 
       int r = 0 ; 
       int max = 0 ; 
       int curr = 0 ; 
       HashSet<Integer> h = new HashSet<>() ;
       while(r<nums.length){
          while(h.contains(nums[r])){
            curr -= nums[l] ; 
            h.remove(nums[l]) ;
            l++ ;
          }
          curr += nums[r] ; 
          h.add(nums[r]) ; 
          max = Math.max(curr,max) ;
          r++ ;
       }
       return max ;
    }
}