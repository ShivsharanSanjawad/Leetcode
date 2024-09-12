class Solution {
    public int log2(int n){
        if(n<2){
            return 0 ;
        }
        return 1+log2(n>>1) ;
    }
    public int minImpossibleOR(int[] nums) {
        boolean a[] = new boolean[60] ; 
        for(int i =0  ; i<nums.length ; i++){
            if((nums[i]&(nums[i]-1))==0){
                a[log2(nums[i])] = true;
            }
        }
        for(int i = 0 ; i<60 ; i++){
            if(!a[i]){
                return 1<<i ;
            }
        }
        return 1 ;
    }
}