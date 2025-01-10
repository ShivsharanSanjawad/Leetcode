class Solution {
    int freq[][] ; 
    int max[] ;
    public boolean ok(int i){
        for(int k= 0 ;k<26 ;k++){
            if(freq[i][k]<max[k]){
                return false ;
            }
        }
        return true ;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>() ; 
        freq = new int[words1.length][26] ;
        int [][]freq2 = new int[words2.length][26] ;
        max = new int[26] ;
        for(int i = 0;i<words1.length;i++){
            for(int j= 0 ;j<words1[i].length();j++){
                int x = words1[i].charAt(j) -'a' ; 
                freq[i][x] +=1 ;
            }
        }
        for(int i = 0;i<words2.length;i++){
            for(int j= 0 ;j<words2[i].length();j++){
                int x = words2[i].charAt(j) -'a' ; 
                freq2[i][x] +=1 ;
                if(max[x]<freq2[i][x]){
                    max[x] = freq2[i][x] ;
                }
            }
        }
        for(int i = 0; i<words1.length;i++){
            if(ok(i)){
                ans.add(words1[i]);
            }
        }
        return ans ;
    }
}