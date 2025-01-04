class Solution {
    public int countPalindromicSubsequence(String s) {
        int first [] = new int[26] ; 
        int last [] = new int[26] ; 
        Arrays.fill(first,-1) ; 
        Arrays.fill(last,-1) ;
        for(int i = 0 ;i<s.length();i++){
            int x = s.charAt(i) -'a' ; 
            if(first[x]==-1){
                first[x] = i ;
                last[x] = i ;
            }else last[x] = i ;
        }
        int count = 0 ;
        for(int i =0 ; i<26 ;i++){
            int x = first[i] ; 
            int y = last[i] ; 
            int temp = 0; 
            for(int j = x+1 ; j<y ;j++){
                int c = s.charAt(j) -'a' ; 
                temp = temp|(1<<c) ;
            }
            count +=Integer.bitCount(temp) ;
        }
        return count ;
    }
}