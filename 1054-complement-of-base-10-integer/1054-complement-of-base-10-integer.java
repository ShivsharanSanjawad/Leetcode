class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
        return 1 ; 
        int x = n ; 
        int y = 1;
        while(x>0){
            n = n^y ; 
            y = y<<1 ; 
           x = x>>1 ; 
        }
        return n ;
    
    }
}