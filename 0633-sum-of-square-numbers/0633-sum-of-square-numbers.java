class Solution {
    public boolean judgeSquareSum(int c) {

         

        long b = (int)Math.sqrt(c) ; 
        long a = 0 ; 
        while(a<=b){
         long sum = (b*b+a*a) ;
             if(sum==c){
                 return true ;
             }
             if(sum<c){
                 a++ ;
             }else 
             b-- ;
        }
        return false ;
}
}