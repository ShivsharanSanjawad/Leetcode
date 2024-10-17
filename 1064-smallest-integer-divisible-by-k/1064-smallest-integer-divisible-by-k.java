class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0)
            return -1;
        HashSet<Integer> h = new HashSet<>() ;
        int rem10 = 10%k ; 
        int x = 1 ; 
        for(int i =1 ; !h.contains(x); i++){
            if(h.contains(x)){
                return -1 ;
            }
            h.add(x);
            if(x%k==0){
                return i ;
            }
            x = (x*rem10 + 1)%k ; 
        }
        return -1 ;
    }
}