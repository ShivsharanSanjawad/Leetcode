class Solution {
    public long kMirror(int k, int n) {
       int x = 1 ;
       long sum = 0 ; 
       while(n>0){
            int j =  x/2 ; 
            if(x%2==1){
                j++ ;
            }
            long s = (long)Math.pow(10,j-1);
            if(x%2==1){
                for(long i=s;i<s*10;i++){
                    String a = Long.toString(i) ; 
                    StringBuilder temp = new StringBuilder(a.substring(0,a.length()-1)).reverse() ; 
                    long num = Long.parseLong(a+temp.toString());
                    if(isPali(num,k)){
                        n-- ; 
                        sum +=num ; 
                        if(n==0){
                            return sum; 
                        }
                    }
                }
            }else{
                for(long i=s;i<s*10;i++){
                    String a = Long.toString(i) ;
                    StringBuilder temp = new StringBuilder(a).reverse() ;
                    long num = Long.parseLong(a+temp.toString()) ;
                    if(isPali(num,k)){
                        n-- ; 
                        sum +=num ; 
                        if(n==0){
                            return sum;
                        }
                    }
                }
            }
            x++ ;
       }
       return sum; 
    }
    public static boolean isPali(long n ,int k){
        String x = Long.toString(n,k) ; 
        StringBuilder temp = new StringBuilder(x).reverse() ; 
        return x.equals(temp.toString());
    }
}
