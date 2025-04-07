class Solution {
    int [][]dp  ;
    public boolean canPartition(int[] nums) {
        long sum = 0 ;  
        for(int i=0;i<nums.length;i++){
            sum +=nums[i] ; 
        }
        if(sum%2==1){
            return false ;
        }
        dp = new int[nums.length+1][101*nums.length] ;
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1) ;
        } 
        return get(nums,0,sum>>1,0);
    }
    public boolean get(int []nums,int i , long sum,long curr){
        if(curr==sum){
            return true ; 
        }
        if(i>=nums.length){
            return curr==sum ;
        }
        if(dp[i][(int)curr]!=-1){
            return dp[i][(int)curr]==1?true:false ;
        }
        boolean choose = get(nums,i+1,sum,curr+nums[i]) ; 
        boolean nonChoose = get(nums,i+1,sum,curr) ; 
        dp[i][(int)curr] = (choose||nonChoose)?1:0 ;
        return choose||nonChoose ;
    }
}