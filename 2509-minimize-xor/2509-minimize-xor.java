class Solution {
    public int minimizeXor(int num1, int num2) {
       int x = Integer.bitCount(num1) ; 
       int y = Integer.bitCount(num2) ; 
       if(x==y){
        return num1 ;
       }
       if(x<y){
            int k = y -x ;
            while(k-->0){
                num1 |= (num1+1) ;
            }
       }else{
            int k = x - y ; 
            while(k-->0){
                num1 &= (num1-1);
            }
       }
       return num1;
    }
}