class NumArray {
    int []ans ;
    int[]nums ;
    public NumArray(int[] nums) {
        this.nums = nums ;
        ans = new int[nums.length] ;
       ans[0] = nums[0] ;
        for(int i =1 ;i<nums.length;i++){
            ans[i] = ans[i-1] +nums[i] ; 
        }
     //    System.out.println(Arrays.toString(ans)) ;
    }
    
    public int sumRange(int left, int right) {
        return ans[right]-ans[left] +nums[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */