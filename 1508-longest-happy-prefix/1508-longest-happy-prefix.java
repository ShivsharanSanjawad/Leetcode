class Solution {
    public int kmp(String s){
        int [] lps = new int[s.length()] ; 
        lps[0] = 0 ;
        for(int i  = 1 ; i<lps.length;i++){
            int prev = lps[i-1] ; 
            while(prev>0&&s.charAt(i)!=s.charAt(prev)){
                prev = lps[prev-1];
            }
            lps[i] = prev + ((s.charAt(i)==s.charAt(prev))?1:0) ;
        }
        return lps[s.length()-1] ;
    }
    public String longestPrefix(String s) {
        int x= kmp(s) ;
        return s.substring(0,x);
    }
}