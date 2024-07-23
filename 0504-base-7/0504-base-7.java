import java.math.BigInteger ;
class Solution {
    public String convertToBase7(int num) {
        BigInteger x = new BigInteger(Integer.toString(num)) ; 
        
        return x.toString(7) ;
    }
}