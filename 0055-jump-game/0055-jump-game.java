class Solution {
    int [] dp ; 
    public boolean get(int []nums , int n){
        if(n==nums.length-1){
            return true ;
        }
        if(n>=nums.length){
            return false ;
        }
         if(nums[n]==0){
            return false ;
        }
        if(dp[n]!=-1){
            return dp[n]==1 ;
        }
        boolean flag = false ;
        for(int i = 1 ;i<=nums[n] ;i++){
            flag = flag| get(nums , n+i);
            if(flag==true){
                break ;
            }
        }
        dp[n] = flag?1:0 ;
        return flag ;
    }
    public boolean canJump(int[] nums) {
        dp = new int[nums.length-1];
        Arrays.fill(dp,-1);
        return get(nums,0);
    }   
}