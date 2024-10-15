class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a[] = new int[cost.length+1]; 
        a[cost.length ] = 0 ;
        a[cost.length-1] =  cost[cost.length-1]; 
        //a[cost.length-2] = ; 
        for(int i = cost.length -2 ; i>=0 ; i--){
            a[i] = cost[i]  + Math.min(a[i+1],a[i+2]) ;
        }
        return Math.min(a[0],a[1]) ;
    }
}