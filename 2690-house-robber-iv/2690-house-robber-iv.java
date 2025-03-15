class Solution {
    int a[] ;
    int k ; 
    public int minCapability(int[] nums, int k) {
        this.a = nums; 
        this.k = k ; 
        int min = Integer.MAX_VALUE ; 
        int max = -1  ; 
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min = nums[i] ; 
            }
            if(max<nums[i]){
                max = nums[i] ; 
            }
        }
        int s = min ; 
        int e = max ; 
        int ans = max ;
        while(e>=s){
            int mid = s + (e-s)/2 ; 
            //System.out.println(mid+" "+get(mid));
            if(get(mid)){
                ans = mid ; 
                e = mid -1 ; 
            }else s = mid + 1 ; 
        }
        return ans ;
    }
    public boolean get(int n){
       int x = get2(n,0) ;
       //System.out.println(x); 
       return x>=k ;
    }
    public int get2(int n , int i){
        if(i>=a.length){
            return 0 ; 
        }
        int x = 0 ;
        int y = 0 ; 
        if((n>=a[i])){
            x = 1+get2(n,i+2) ; 
        }
        y = get2(n,i+1) ;
        return Math.max(x,y);
    }
}
