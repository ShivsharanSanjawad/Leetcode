class Solution {
    HashMap<String , Integer> h ;
    char [] s ;
    public int numTilePossibilities(String tiles) {
        h = new HashMap<>() ;
        this.s = tiles.toCharArray() ;
        Arrays.sort(this.s);
        generate(0,"") ;
        int answer = 0;
        for(String x:h.keySet()){
            int [] freq = new int[26] ;
            for(int i=0 ;i<x.length();i++){
                int y = x.charAt(i)-'A' ;
                freq[y]++;
            }
            int ans = fact(x.length()) ;
            for(int i=0 ;i<26;i++){
                ans /=fact(freq[i]); 
            }
            answer +=ans;
        }
        return answer-1 ;
    }
    
    public void generate(int i,String x){
       if(i>=s.length){
            h.put(x,0);
            return ;
       }
       generate(i+1,x) ;
       generate(i+1,x+s[i]) ;
    }

    public int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}