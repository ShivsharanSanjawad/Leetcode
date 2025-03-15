class Solution {
    public int shipWithinDays(int[] w, int d) {
        int s = 1 ; 
        int e = Integer.MAX_VALUE ; 
        int ans = e ;
        while(e>=s){
            int mid = s + (e-s)/2 ; 
            if(get(w,mid,d)){
                ans = mid;
                e = mid -1 ;
            }else s = mid+1 ;
        }
       // System.out.println(get(w,55,1));
        return ans ; 
    }
    public boolean get(int []w , int mid , int d){
        int days = 1 ; 
        int sum = 0  ; 
        for(int i=0;i<w.length;i++){
            if(w[i]>mid){
              return false ;
            }
            if((sum+w[i])>mid){
                sum =  0 ; 
                days++ ; 
            }
            sum +=w[i] ;
        }
        if(sum>mid){
            days++ ; 
        }
        return days<=d  ; 
    }
}