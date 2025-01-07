class Solution {
    public boolean kmp(String x , String s){
        int lps[] = new int[s.length()+x.length()+1] ; 
        lps[0] = 0 ; 
        String fina = x+"#"+s ; 
        for(int i = 1 ;i<fina.length();i++){
            int prev = lps[i-1] ; 
            while(prev>0&&fina.charAt(i)!=fina.charAt(prev)){
                prev = lps[prev-1] ;
            }
            lps[i] = prev + ((fina.charAt(prev)==fina.charAt(i))?1:0) ; 
            if(lps[i]==x.length()){
                return true ;
            }
        }
        return false ;
    }
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>() ;
        for(int i = 0;i<words.length;i++){
            for(int j  = 0 ; j<words.length;j++){
                if(j!=i&&kmp(words[i],words[j])){
                    ans.add(words[i]) ; 
                    break ;
                }
            }
        }
        return ans ;
    }
}