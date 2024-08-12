void moveZeroes(int* nums, int n) {
    int x = 0 ; 
    for(int i = 0 ; i<n ;i++){
        if(nums[i]!=0){
            nums[x++] = nums[i] ;
            if(x-1!=i){
                nums[i]= 0 ;
            }
        }
    }
}