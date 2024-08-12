void moveZeroes(int* nums, int n) {
    if(n==1)
        return ;
        int i = 0 ; 
        int j = 0; 
        while(j<n){
            if(i<n){
              if(nums[i]==0){
                    while(j<n&&nums[j]==0){
                        j++ ;
                    }if(j!=n){
                    nums[i] = nums[j] ;
                    nums[j] = 0 ;
                    }

              }
              i++ ; 
              if(j<i){
                j= i; 
              }
            }
        }
        for( ; i<n ; i++){
            nums[i] = 0 ;
        }
}