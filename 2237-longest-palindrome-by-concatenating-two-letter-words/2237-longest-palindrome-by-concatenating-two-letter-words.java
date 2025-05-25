class Solution {
    public int longestPalindrome(String[] words) {
        int [][] store = new int[26][26] ; 
        int count = 0 ; 
        int count2 = 0;
        for(int i=0;i<words.length;i++){
            int x = words[i].charAt(0) -'a' ; 
            int y = words[i].charAt(1) -'a' ;
            if(store[y][x]>0){
                count+=4 ;
                store[x][y]-- ;
                store[y][x]-- ;
            }
            store[x][y]++ ;
        }
        for(int i=0;i<26;i++){
            if(store[i][i]>0){
                count+=2 ; 
                break ;
            }
        }
        return count ;
    }
}