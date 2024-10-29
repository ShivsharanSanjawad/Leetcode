class Solution {
    int a[] ;
    public int get(int n){
        if(n<=1){
            return 1; 
        }
        if(a[n]!=0){
            return a[n] ;
        }
        a[n] = get(n-1)+get(n-2);
        return a[n] ;
    }
    public int climbStairs(int n) {
        a = new int[n+1];
        return get(n);
    }
}