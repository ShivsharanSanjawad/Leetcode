class Solution {
    public boolean isCircularSentence(String s) {
        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false ;
        }
        char prev = 0 ; 
        for(int i = 0 ; i<s.length() -1 ; i++){
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