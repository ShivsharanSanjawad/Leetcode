class Solution {
    public int minDays(int[] b, int m, int k) {
        if(m*k>b.length){
            return -1 ;
        }   
        int min = Integer.MAX_VALUE ; 
        int max = -1 ; 
        for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max = b[i] ;
            }
            if(b[i]<min){
                min = b[i] ; 
            }
        }
        int s = min ; 
        int e = max ; 
        int ans = -1 ;
        while(e>=s){
            int mid = s + (e-s)/2 ; 
           // System.out.println(mid+" "+get(b,mid,m,k));
            if(get(b ,mid,m ,k)){
                ans = mid ;
                e = mid-1 ;
            }else s = mid+1 ;
        }
        return ans ;
    }
    public boolean get(int []b , int n , int m , int k){
        int count = 0 ;
        int prev = 0 ;
        for(int i=0;i<b.length;i++){
            if(b[i]<=n){
                prev ++ ;
            }else {
                count += prev/k ;
                prev = 0 ; 
            }
        }
        count += prev/k ; 
        return count>=m; 
    }
}