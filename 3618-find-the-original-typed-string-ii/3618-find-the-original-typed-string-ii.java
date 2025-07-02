class Solution {
    long mod = 1000000007;
    public int possibleStringCount(String s, int k) {
        long dp[][] ;
        ArrayList<Long> freq =  new ArrayList<>() ; 
        long count = 1 ; 
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++ ;
            }else{
                freq.add(count) ; 
                count = 1 ; 
            }
        } 
        freq.add(count);
        long ans = 1 ; 
        for(int i=0;i<freq.size();i++){
            ans =   (1L*ans*freq.get(i))%mod ;
        }
        if(freq.size()>=k){
             return (int)ans ;
        }
        dp = new long[freq.size()+1][k] ;
        for(int i=1;i<=freq.get(0)&&i<k;i++){
            dp[0][i] = 1; 
        }
        count = 0 ; 
        for(int i=1;i<freq.size();i++){
            long prefix[] = new long[k]; 
            prefix[0]= dp[i-1][0] ; 
            for(int j=1;j<k;j++){
                prefix[j] = (prefix[j-1] + dp[i-1][j])%mod;
            }
            for(int j=1;j<k;j++){
                // long count2 = 0 ; 
                // for(int z =1;z<=freq.get(i)&&z<=j;z++){
                //     count2 = (count2 + dp[i-1][j-z])%mod ;
                // }
                // dp[i][j] = count2 ;
                long x = freq.get(i);
                if(freq.get(i)>=j){
                    dp[i][j] = prefix[j-1];
                }else{
                    dp[i][j] = (prefix[j-1] -prefix[j-(int)x-1] + mod)%mod; 
                }
            }
        }
        for(int i=1;i<k;i++){
            count = (count + dp[freq.size()-1][i])%mod;
        }
        long x = (ans-count+mod)%mod ; 
        return (int)x;
    }
}