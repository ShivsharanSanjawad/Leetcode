class Solution {
    public int maxWidthRamp(int[] nums) {
        int prefix [] = new int[nums.length] ; 
        prefix [nums.length-1] = nums[nums.length-1] ;
        for(int i  = nums.length -2 ; i>=0 ;i--){
            prefix[i] = Math.max(prefix[i+1],nums[i]) ;
        }
        int max = Integer.MIN_VALUE ; 
        int i = 0 ; 
        int j = 0 ; 
        while(j<nums.length){
            if(prefix[j]<nums[i]){
                i++ ; 
               }
        if((j-i)>max){
            max = j-i ;
        }
        j++;
        }
        return max ;
    }
}