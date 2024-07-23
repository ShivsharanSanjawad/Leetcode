class Solution {
    public int minChanges(int n, int k) {
        int x = n^k ; 
        int count = 0 ;
        while(x>0){
            if(x%2==1){
                if(n%2!=1)
                return -1 ;
                 count++ ;
            }
           
            x= x/2 ;
            n = n/2 ;
        }
        return count ;
    }
}