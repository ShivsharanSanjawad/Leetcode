class Solution {
    int [] dp ; 
    public int get(int [] nums,int i){
        if(i==nums.length-1){
            return 1; 
        }
        if(i>=nums.length){
            return  1 ; 
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int max = 1 ;
        for(int j = i ;j<nums.length;j++){
            if(nums[i]<nums[j]){
                int x = get(nums,j) +1 ;
                if(max<x){
                    max = x ;
                }
            }
        }
        dp[i] =  max ;
        return dp[i] ;
    }
    public int lengthOfLIS(int[] nums) {
        int max = 1 ;
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        for(int i = 0 ; i<nums.length ;i++){
            int x = get(nums,i);
            if(max<x){
                max = x;
            }
        }
        return max ;
    }
}