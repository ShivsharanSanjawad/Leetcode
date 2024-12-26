int **dp ; 
int get(int *nums , int n , int target , int i,int sum){ 
        if(i==n){
            return sum==target ;
        }
        if(dp[i][sum+1000]!=-1){
            return dp[i][sum+1000];
        }
        int x =  get(nums,n,target,i+1,sum+nums[i])+get(nums,n,target,i+1,sum-nums[i]) ;
        dp[i][sum+1000] =x ; 
        return x;
}
int findTargetSumWays(int* nums, int numsSize, int target) {
        dp = malloc(sizeof(int*)*numsSize);
        for(int i = 0 ; i<numsSize ;i++){
            dp[i] = malloc(sizeof(int)*2000);
        } 
        for(int i = 0 ; i<numsSize;i++){
            for(int j = 0 ;j<2000;j++){
                dp[i][j] = -1 ;
            }
        }
        return get(nums,numsSize ,target,0,0) ;
}
