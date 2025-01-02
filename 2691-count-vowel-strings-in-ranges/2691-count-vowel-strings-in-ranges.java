class Solution {
    public boolean isvowel(char ch){
        return "aeiou".contains(ch+"") ;
    }
    public boolean isok(String s){
        return isvowel(s.charAt(0))&&isvowel(s.charAt(s.length()-1)) ;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length]  ; 
        int[] prefix = new int[words.length+1] ; 
        for(int i =0 ;i<words.length;i++){
            if(isok(words[i])){
                prefix[i+1] = prefix[i] +1 ;
            }else prefix[i+1] = prefix[i] ;
        }
        for(int i = 0 ;i<queries.length;i++){
            ans[i] = prefix[queries[i][1]+1] - prefix[queries[i][0]] ;
        }
        return ans;
    }
}