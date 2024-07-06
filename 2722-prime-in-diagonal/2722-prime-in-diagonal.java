class Solution {
      public boolean isPrime(int n){
        
        for(int i =2 ; i<=Math.sqrt(n); i++){
            if(n%i==0)
            return false; 
        }
        if(n==1)
        return false ;
        return true ;
    }
    public int diagonalPrime(int[][] nums) {
        int max = 0 ;
            for(int i = 0 ; i<nums.length ;i++){
                    if(isPrime(nums[i][i])){
                        if(max<nums[i][i])
                        max = nums[i][i] ;
                    }
                    if(isPrime(nums[i][nums.length-i-1])){
                          if(max<nums[i][nums.length-i-1])
                        max = nums[i][nums.length-i-1] ;
                    }
            }
            return max ;
    }
}