class Solution {
    public boolean get(int []nums , int[][]q,int j){   
        int x[] = new int[nums.length+1]  ; 
        for(int i=0;i<j;i++){
            x[q[i][0]] +=q[i][2] ;
            x[q[i][1]+1] -=q[i][2] ; 
        }
        int sum = 0 ; 
        for(int i=0;i<nums.length;i++){
            sum +=x[i] ; 
            if(sum<nums[i]){
                return false ;
            }
        }
        return true ;
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        int s = 0 ; 
        int e = queries.length ;
        int ans = -1 ;
        while(e>=s){
            int mid = s + (e-s)/2 ; 
            if(get(nums,queries,mid)){
                e = mid-1 ;
                ans = mid ;
            }else s = mid+1 ;
        }
        return ans ;
    }
}