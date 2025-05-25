class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
       // return get(text1,text1.length()-1,text2,text2.length()-1);
       int [][] dp = new int[text1.length()+1][text2.length()+1] ;
       char [][] c = new char[text1.length()+1][text2.length()+1];
       for(int i=0;i<dp.length;i++){
            dp[i][0] = 0 ;  
       }
       for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0 ;
       }
       for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j]+1 ;
                    c[i+1][j+1] ='\\';
                }else {
                    dp[i+1][j+1] = (int)Math.max(dp[i][j+1],dp[i+1][j]);
                    if(dp[i][j+1]>dp[i][j+1]){
                        c[i+1][j+1] = '|' ;
                    }else c[i+1][j+1] = '_' ;
                }
            }
       }
       String s = "" ;
       int i = dp.length-2 ; 
       int j = dp[0].length-2 ;
       while(i>0&&j>0){
            if(c[i][j]=='\\'){
                s = text1.charAt(i-1) + s ;
                i-- ; 
                j-- ;
            }else if(c[i][j]=='_'){
                i--;
            }else j-- ;
       }
       System.out.println(s);
       return dp[text1.length()][text2.length()];
    }

    public int get(String x,int i,String y,int j){
        if(i==-1||j==-1){
            return 0 ;
        }
        if(x.charAt(i)==y.charAt(j)){
            return 1+get(x,i-1,y,j-1);
        }
        return Math.max(get(x,i-1,y,j),get(x,i,y,j-1));
    }
}