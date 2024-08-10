class Solution {
    public char findTheDifference(String s, String t) {
        char [] x = s.toCharArray() ; 
        char [] y = t.toCharArray() ; 
        Arrays.sort(x) ;
        Arrays.sort(y) ; 
        for(int i = 0 ;i<x.length ; i++){
            if(x[i]!=y[i])
            return y[i] ; 
        }
        return y[y.length -1] ;
    }
}