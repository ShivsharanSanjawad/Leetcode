class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        long sum = 0 ;  
        for(int i = 0 ;i<rolls.length  ; i++){
            sum+=rolls[i] ; 
        }
        long ans = mean*(n+rolls.length) - sum ; 
        if(Math.ceil((ans/(n*1.0)))>6)
        return new int[]{} ;
        if((ans/n)<1){
            return new int[]{} ;
        }
        int []a = new int[n] ; 
        int x =(int) (ans/n) ; 
        long curr = 0 ;
        for(int i= 0 ;i<n ; i++){
            if((ans-curr)==(n-i)){
                //a[i-1] =1 ;
                while(i<n){
                    a[i] = 1; 
                    curr+=a[i] ; 
                    i++ ;
                }
                if(curr<ans){
                    a[i-1]= (int) (ans-curr ); 
                }
                return a;
            }
            a[i] = x ; 
            curr +=a[i] ; 
        }
        if(curr<ans){
           
                        while(ans!=curr){
                        for(int i = 0 ; i<n ; i++){
                            if(curr==ans){
                                return a ;
                            }
                            a[i]++ ; 
                            curr++ ; 
                        }

                        }
                    }
                
        return a ;
    }
}