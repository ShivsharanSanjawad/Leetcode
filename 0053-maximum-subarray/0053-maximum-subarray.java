class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0] ;
        }
        int mid = nums.length/2 ; 
        int x = maxSubArray(Arrays.copyOfRange(nums,0,mid)) ;
        int y = maxSubArray(Arrays.copyOfRange(nums,mid,nums.length)) ; 
        int sum = 0 ; 
        int maxleft = Integer.MIN_VALUE ; 
        int maxright = Integer.MIN_VALUE ; 
        int j = mid-1 ; 
        while(j>=0){
            sum += nums[j--] ; 
            if(sum>maxleft){
                maxleft = sum ;
            }
        }
        j = mid ; 
        sum =  0 ;
        while(j<nums.length){
            sum +=nums[j++] ;
            if(sum>maxright){
                maxright = sum ;
            }
        }
     //   System.out.println(maxleft+" "+maxright) ;
        return Math.max(Math.max(x,y),maxleft+maxright) ;
    }
}