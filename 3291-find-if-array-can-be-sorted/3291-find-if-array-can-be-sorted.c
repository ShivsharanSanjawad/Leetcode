bool canSortArray(int* nums, int numsSize) {
    int prev = -1 ; 
    for(int i = 0 ; i<numsSize ; ){
        int max = -1 ; 
        int min = 2e8+1 ;
        int temp = __builtin_popcount(nums[i]) ;
        while(i<numsSize&&__builtin_popcount(nums[i])==temp){
            if(nums[i]>max) max = nums[i] ;
            if(nums[i]<min)  min = nums[i] ; 
            i++ ; 
        }
        if(min<prev) return 0 ; 
        prev = max ;
    }
    return 1;
}