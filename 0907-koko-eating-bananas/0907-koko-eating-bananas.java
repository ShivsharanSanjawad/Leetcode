class Solution {
    int a[] ; 
    int k ; 
    public boolean get(int n){
        long sum = 0 ;
        for(int i=0 ;i<a.length;i++){
            sum += (int)Math.ceil(a[i]/(n*1.0)) ;
        }
        return sum<=k ;
    }
    public int minEatingSpeed(int[] piles, int h) {
        this.a = piles ; 
        this.k = h ;
        Arrays.sort(a);
        int s = 1 ;
        int max = -1 ; 
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max = piles[i] ;
            }
        }
        int e = max; 
        int ans = e ; 
        while(e>=s){
            int mid = s + (e-s)/2 ; 
            if(get(mid)){
                e = mid-1 ; 
                ans = mid ;
            }else s = mid+1 ;
        }
        return ans ;
    }
}