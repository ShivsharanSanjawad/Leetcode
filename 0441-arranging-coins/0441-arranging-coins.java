class Solution {
    public int arrangeCoins(int n) {
        double r = Math.sqrt(1+(8.0*n))/2 ;
        return (int)(r-0.5) ;
    }
}