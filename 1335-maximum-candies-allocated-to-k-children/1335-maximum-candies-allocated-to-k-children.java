class Solution {
    int a[] ;
    public long get(int k){
        if(k==0){
            return Long.MAX_VALUE;
        }
        int s = 0 ; 
        int e = a.length -1 ; 
        int ans = -1 ;
        while(e>=s){
            int mid = s+(e-s)/2 ; 
            if(a[mid]>=k){
                ans = mid ;
                e = mid -1 ;
            }else s = mid +1 ;
        }
        if(ans==-1){
            ans = 0 ; 
        }
        long sum = 0 ; 
        for(int i=ans;i<a.length;i++){
            sum += a[i]/k ; 
        }
        return sum ;
    }
    public int maximumCandies(int[] candies, long k) {
        this.a = candies ; 
        Arrays.sort(a) ;
        int s = 0 ; 
        int e = candies[a.length-1] ;
        int ans = 0 ;
        while(e>=s){    
            int mid = s + (e-s)/2 ; 
            if(get(mid)>=k){
                ans = mid ; 
                s = mid+1 ;
            }else e = mid -1;
        }
        return ans ;
    }
}