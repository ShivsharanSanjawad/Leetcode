class Solution {
    public int minAddToMakeValid(String s) {
      //  Stack<Character> st = new Stack<>() ; 
        int count = 0 ;
        int ycount = 0 ; 
        for(int i = 0 ;i<s.length() ; i++){
            if(s.charAt(i)=='('){
                 ycount++ ;
            }else if(ycount>0){
                ycount -- ;
            }else count++ ;
         
        }
        return count + ycount  ;
    }
}