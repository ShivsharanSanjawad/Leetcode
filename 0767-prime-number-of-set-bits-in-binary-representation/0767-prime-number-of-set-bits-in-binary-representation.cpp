class Solution {
    public :
    bool prime(int n){
        if(n<2)
        return false ; 
        for(int i = 2 ;i<=sqrt(n);i++){
            if(n%i==0){
                return false ;
            }
        }
        return true ;
    }
public:
    int countPrimeSetBits(int left, int right) {
        int count = 0 ;
        for(int i = left ;i<=right ; i++){
            if(prime(__builtin_popcount(i))){
                count++ ;
            }
            
        }
        return count ;
    }
};