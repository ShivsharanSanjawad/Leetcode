class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int s = 0 ; 
        int e = Integer.MAX_VALUE ; 
        int ans = e ;
        while(e>s){
            int mid = s + (e-s)/2 ; 
            if(get(nums,p,mid)){
                ans = mid ; 
                e = mid ;
            }else s = mid +1 ;
        }
        return ans ;
    }
    public boolean get(int a[] ,int p , int mid){
        int count = 0 ; 
        boolean prev = false ;
        for(int i=0;i<a.length-1;i++){
            if(!prev&&a[i+1]-a[i]<=mid){
                count++ ;
                prev = true ;
            }else prev = false ;
        }
        return count>=p ;
    }
}