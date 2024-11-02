class Solution {
    public boolean isCircularSentence(String s) {
        int n = s.length() -1 ;
        if(s.charAt(0)!=s.charAt(n)){
            return false ;
        }
        char prev = 0 ; 
   
        for(int i = 0 ; i<n ; i++){
            if(s.charAt(i)==' '){
                if(s.charAt(i+1)!=prev){
                    return false ;
                }
            }
            prev = s.charAt(i) ;
        }
        return true ;
    }
}