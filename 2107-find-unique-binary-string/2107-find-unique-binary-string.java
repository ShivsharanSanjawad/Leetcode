class Solution {
    public long get(String s){
        long ans =  0 ; 
        long x = 0 ; 
        for(int i=s.length()-1;i>=0;i--){
            int y =s.charAt(i) -'0' ; 
            ans += (1L<<x)*y ;
        }
        return ans ;
    }
    public String toBinary(long x,int n){
        StringBuilder b = new StringBuilder()  ; 
        while(x>0){
            b.append(x%2) ; 
            x >>=1 ;
        }
        while(b.length()<n){
            b.append('0') ;
        }
        b.reverse() ; 
        return b.toString() ;
    }
    public String findDifferentBinaryString(String[] nums) {
        HashMap<Long,Long> h = new HashMap<>() ; 
        for(int i=0;i<nums.length;i++){
            long x = get(nums[i]) ; 
            h.put(x,0L) ;
        }
        int n = nums[0].length() ;
        for(long i=0;i<(1L<<n);i++){
            if(!h.containsKey(i)){
                return toBinary(i,n) ;
            }
        }
        return "-1";
    }
}