class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int [] difference = new int[nums.length+1] ; 
        for(int i=0;i<queries.length;i++){
            int x = queries[i][0] ; 
            int y = queries[i][1] ;
            difference[x]-- ;
            difference[y+1]++ ;
        }
        int sum = 0 ; 
        for(int i=0;i<difference.length;i++){
            sum += difference[i] ; 
            difference[i] = sum ; 
        }
        for(int i=0;i<nums.length;i++){
            nums[i]+=difference[i] ; 
            if(nums[i]>0){
                return false ;
            }
        }
        return true ;
    }
}