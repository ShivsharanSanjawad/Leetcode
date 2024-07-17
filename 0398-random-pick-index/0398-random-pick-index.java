import java.util.Random ;
class Solution {
     int [] nums ;
     Random r ;
    public Solution(int[] nums) {
        this.nums = nums ;
        this.r = new Random() ;
    }
    
    public int pick(int target) {
        int curr = nums[0] -1 ; 
        int count = 1;
        for(int i  = 0 ; i<nums.length ; i++){
            if(nums[i]==target){
                  if(r.nextInt(count++)==0){
                    curr = i  ;
                  }
            }
        }
        return curr ;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */