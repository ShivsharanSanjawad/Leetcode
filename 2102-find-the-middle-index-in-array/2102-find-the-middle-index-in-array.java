class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length==1)
        return 0 ; 
        int a[] = new int[nums.length] ;
        a[0] = nums[0] ;  
        for(int i = 1 ; i<nums.length ; i++){
            a[i] = a[i-1] + nums[i] ;
        }
       // System.out.println(Arrays.toString(a)) ;
        for(int i = 0 ;i<nums.length ; i++ ){
            if(i==0){
                if(a[nums.length-1]==a[i]){
                    return 0;
                }
                continue ;
            }
           if((a[i-1]+a[i])==a[nums.length-1]) 
           return i ;
        }
        return -1 ;
    }
}