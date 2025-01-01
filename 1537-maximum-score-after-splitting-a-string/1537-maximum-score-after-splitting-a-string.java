class Solution {
    public int maxScore(String s) {
        int [] prefixone = new int[s.length()] ; 
        int [] prefixtwo = new int[s.length()] ;
        prefixone[0] = s.charAt(0)=='1'?1:0 ; 
        prefixtwo[0] = s.charAt(0)=='0'?1:0 ;
        for(int i = 1 ; i<s.length();i++){
            if(s.charAt(i)=='1'){
                prefixone[i] = prefixone[i-1] + 1; 
                prefixtwo[i] = prefixtwo[i-1] ;
            }else{
                prefixtwo[i] = prefixtwo[i-1] + 1 ; 
                prefixone[i] = prefixone[i-1];
            }
        }
        int max = Integer.MIN_VALUE; 
        for(int i = 0 ; i<s.length()-1;i++){
            int y = s.charAt(i+1)=='1'?1:0 ;
            int x = prefixtwo[i] + (prefixone[s.length()-1]-prefixone[i+1]+y) ;
            max = Math.max(max,x) ;
        }
        return max ;

    }
}