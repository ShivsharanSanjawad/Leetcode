class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int s = 1 ; 
        int e =  (int)(10e5) ; 
        int ans = e ;
        while(e>=s){
            int mid = s + (e-s)/2 ; 
            if(get(nums,mid,t)){
                ans = mid ; 
                e = mid -1 ; 
            }else s = mid +1 ;
        }
        return ans ;
    }
    public boolean get(int []nums, int mid , int t){
        long sum = 0; 
        for(int i=0;i<nums.length;i++){
            sum += Math.ceil(nums[i]/(mid*1.0)) ; 
        }
        return sum<=t ; 
    }
}