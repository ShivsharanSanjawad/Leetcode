class Solution {
    public int get(int n){
        return Integer.bitCount(n);
    }
    public boolean canSortArray(int[] nums) {
        int prev = Integer.MIN_VALUE ; 
        for(int i = 0 ;i<nums.length ;){
            int max = -1 ;
            int min = Integer.MAX_VALUE ; 
            int temp = get(nums[i]);
            while(i<nums.length&&get(nums[i])==temp){
                if(nums[i]>max){
                    max = nums[i] ;
                }
                if(nums[i]<min){
                    min = nums[i] ; 
                }
                i++ ; 
            }
            if(min<prev){
                return false ;
            }
            prev = max ;
        }
        return true ;
    }
}