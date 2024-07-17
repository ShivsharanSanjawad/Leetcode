class Solution {
    public int minOperations(int n) {
        double count = 0 ; 
        for(int i = 0 ; i<n ;i++){
           count = count + Math.abs((2*i+1)-n)/2.0 ;
        }
        return (int)count ;
    }
}