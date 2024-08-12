void moveZeroes(int* nums, int n) {
    int x = 0 ; 
    for(int i = 0 ; i<n ;i++){
        if(nums[i]!=0){
            int temp = nums[i] ; 
            nums[i] = nums[x] ; 
            nums[x] =temp;
           x++ ;
        }
    }
}