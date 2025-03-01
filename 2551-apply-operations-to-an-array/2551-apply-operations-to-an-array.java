class Solution {
    public int[] applyOperations(int[] nums) {
        int a[] = new int[nums.length] ; 
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2 ; 
                nums[i+1] = 0  ;
            }
        }
        int x = 0 ; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                a[x++] = nums[i] ;
                nums[i] = 0 ;
            }
        }
        return a ;
    }
}