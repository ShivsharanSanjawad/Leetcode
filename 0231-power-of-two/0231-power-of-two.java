class Solution {
    public boolean isPowerOfTwo(int n) {
          double y = Math.log10(n) / Math.log10(2) ;
        return (y==(int)y)  ;
    }
}