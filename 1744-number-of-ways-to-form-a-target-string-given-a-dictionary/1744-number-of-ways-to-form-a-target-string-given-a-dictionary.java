class Solution {
    int MOD = 1000000007 ; 
    long [][]dp ; 
    public int numWays(String[] words, String target) {
      int freq[][] = new int[words[0].length()][26] ; 
      int n = words[0].length()  ; 
      for(int i = 0 ; i<n;i++){
        for(int j =0  ; j<words.length;j++){
             freq[i][words[j].charAt(i)-'a']++ ;
        }
      }
      dp = new long[freq.length+1][target.length()+1];
    //   for(int i =0  ; i<words[0].length();i++){
    //     for(int j = 0 ; j<26 ;j++){
    //         System.out.print(freq[i][j]+" ");
    //     }
    //     System.out.println(); 
    //   }
    for(int i = 0 ;i<dp.length;i++){
        dp[i][target.length()] = 1 ;  
    }
    
    for(int i = freq.length-1;i>=0;i--){
    for(int j = target.length()-1; j>=0 ;j--){
        int x = target.charAt(j) -'a';
        dp[i][j] = dp[i+1][j] ;
        dp[i][j] = (dp[i][j] + dp[i+1][j+1]*freq[i][x]%MOD)%MOD ;
    }
    }
      return (int)dp[0][0];

}
    public long get(int freq[][],int i , int j, String s ){
    if(j>=s.length()){
        return 1 ; 
    }
    if(i>=freq.length){
        return 0 ; 
    }
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
    int x = s.charAt(j)-'a' ; 
    long sum= 0 ; 
    for(int k = i ; k<freq.length;k++){
        if(freq[k][x]!=0)
            sum = (sum+ (get(freq, k+1 ,j+1 , s)*freq[k][x])%MOD)%MOD  ; 
    }
    dp[i][j] =  (int)sum; 
    return sum; 
}

}
