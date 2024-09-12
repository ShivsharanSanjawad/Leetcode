class Solution {
    public int log2(int n){
        if(n<2){
            return 0 ;
        }
        return 1+log2(n>>1) ;
    }
    public int minImpossibleOR(int[] nums) {
        int a[] = new int[60] ; 
        for(int i =0  ; i<nums.length ; i++){
            if((nums[i]&(nums[i]-1))==0){
                a[log2(nums[i])] = 1 ;
            }
        }
        for(int i = 0 ; i<60 ; i++){
            if(a[i]==0){
                return 1<<i ;
            }
        }
        return 1 ;
    }
}