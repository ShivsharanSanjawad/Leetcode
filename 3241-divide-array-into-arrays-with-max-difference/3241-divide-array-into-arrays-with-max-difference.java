class Solution {
    public int[][] divideArray(int[] nums, int k) {
       Arrays.sort(nums); 
       for(int i=2;i<nums.length;i+=3){
            int x = nums[i] - nums[i-2] ;
            if(x>k){
                return new int[][]{} ; 
            }
       }
       int a[][] = new int[nums.length/3][3];
       for(int i=0;i<nums.length;i+=3){
            int x = i/3 ; 
            a[x][0] = nums[i] ; 
            a[x][1] = nums[i+1] ;
            a[x][2] = nums[i+2] ;
       }
       return a;
    }
}