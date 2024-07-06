class Solution {
    public boolean isPrime(int n){
        for(int i =2 ; i<Math.sqrt(n); i++){
            if(n%i==0)
            return false; 
        }
        return true ;
    }
    public int countPrimes(int n) {
        int count = 0 ;
        int a[] = new int[n] ; 
        for(int i = 2 ;i<=Math.sqrt(n) ; i++){
             int j = 1 ; 
            if(isPrime(i))
            j = 2 ;
               while(j*i<=n){
                a[j*i-1] = 1 ;
                j++ ;
               }
        }
        for(int i = 0 ; i<n-1 ; i++){
            if(a[i]==0&&i!=0)
            count++ ;
        }
        return count ;
    }
}