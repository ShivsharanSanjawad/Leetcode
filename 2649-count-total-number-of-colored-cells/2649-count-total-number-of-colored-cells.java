class Solution {
    public long coloredCells(int n) {
        long x = n ; 
        long count = 2*x*(x-1) +1 ;
        return count;
    }
}