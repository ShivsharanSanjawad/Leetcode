class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefix[] = new int[nums.length] ;
        prefix[0] = nums[0] ; 
        for(int i = 1 ; i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i] ;
        }   
        //System.out.println(Arrays.toString(prefix));
        Arrays.sort(prefix) ; 
       // System.out.println(Arrays.toString(prefix));
        return Math.max(Math.max(Math.abs(prefix[0]),Math.abs(prefix[nums.length-1])),Math.abs(prefix[0]-prefix[nums.length-1]));
    }
}