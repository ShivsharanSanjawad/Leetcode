class Solution {
    int [][] dp ;
    public boolean isMatch(String s, String p) {
       dp = new int[s.length()][p.length()] ;
       for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
       }
       return get(s,p,0,0)||get(p,s,0,0) ;
    }
    public boolean get(String s, String p,int i , int j){
        if(i==s.length()&&j==p.length()){
            return true ; 
        }
        if(j==p.length()){
            return false ;
        }
        if(i==s.length()){
            for(int x=j;x<p.length();x++){
                if(p.charAt(x)!='*'){
                    return false ;
                }
            }
            return true ;
        }
        if(dp[i][j]!=-1){
             return dp[i][j]==1?true:false ; 
        }
        if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'){
             dp[i][j] = get(s,p,i+1,j+1)?1:0 ;
             return dp[i][j]==1?true:false ; 
        }
        if(p.charAt(j)=='*'){
             dp[i][j] = (get(s,p,i+1,j)||get(s,p,i,j+1))?1:0;
             return dp[i][j]==1?true:false ; 
        }
         dp[i][j] = 0 ;
         return false ; 
    }  
}