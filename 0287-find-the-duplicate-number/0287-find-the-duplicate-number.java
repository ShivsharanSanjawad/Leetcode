
class Solution {
    public int findDuplicate(int[] nums) {
      int slow = 0  ; 
      int fast = 0 ; 
      do {
        slow = nums[slow] ; 
        fast = nums[nums[fast]] ;
      }while(slow!=fast)  ; 
      fast = 0 ; 
      while(fast!=slow){
            fast = nums[fast] ; 
            slow = nums[slow] ; 
      }
      return fast ; 
    }
}