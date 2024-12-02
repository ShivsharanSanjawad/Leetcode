class Solution {
    public int isPrefixOfWord(String sentence, String k) {
        String  [] s= sentence.split(" "); 
        for(int i = 0 ; i<s.length ; i++){
            if(s[i].startsWith(k)){
                return i+1 ;
            }
        } 
        return -1 ;
    }
}