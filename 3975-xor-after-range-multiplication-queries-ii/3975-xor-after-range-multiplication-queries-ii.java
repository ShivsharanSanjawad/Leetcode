class Solution {
    static final int mod = 1000000007; 
    public int modInverse(int n){
        return (int)pow(n,mod-2) ;
    }
    public long pow(long a, long b){
        long result = 1; 
        while(b>0){
            if(b%2==1){
                result =(result*a)%mod ;
            }
            a =(a*a)%mod ;
            b >>=1 ;
        }
        return result ;
    }
    public int xorAfterQueries(int[] a, int[][] q) {
        int prefix[] = new int[a.length+1]  ; 
        int prefix1[] = new int[a.length+1] ; 
        Arrays.fill(prefix,1) ;
        Arrays.fill(prefix1,1) ; 
        for(int i=0;i<q.length;i++){
            int s = q[i][0] ;
            int e = q[i][1] ; 
            int k = q[i][2] ; 
            int v = q[i][3] ; 
            if(k==1){
                prefix[s] = (int)((1L*prefix[s]*v)%mod) ; 
                if(e+1<prefix.length)
                prefix[e+1] = (int)((1L*prefix[e+1]*modInverse(v))%mod) ; 
            }else if(k==2){
                prefix1[s] = (int)((1L*prefix1[s]*v)%mod) ; 
                if((e-s)%2==0){ 
                    if(e+2<prefix1.length){
                        prefix1[e+2] = (int)((1L*prefix1[e+2]*modInverse(v))%mod) ;
                    }
                }else{
                    if(e+1<prefix1.length){
                        prefix1[e+1] = (int)((1L*prefix1[e+1]*modInverse(v))%mod) ; 
                    }
                }   
            }else{
                while(e>=s){
                    a[s] = (int)((1L*a[s]*v)%mod) ; 
                    s +=k ;
                }
            }
        }
       for(int i=1;i<prefix.length-1;i++){
            prefix[i] = (int)((1L*prefix[i]*prefix[i-1])%mod);
       }
       for(int i=2;i<prefix1.length-1;i++){
           prefix1[i] = (int)((1L*prefix1[i-2]*prefix1[i])%mod) ; 
       }
       for(int i=0;i<prefix.length-1;i++){
           prefix[i] = (int)((1L*prefix[i]*prefix1[i])%mod) ;
           a[i] = (int)((1L*prefix[i]*a[i])%mod);
       }
        int xor = 0 ; 
        for(int i=0;i<a.length;i++){
            xor ^=a[i] ; 
        }
        return xor ; 
    }
}