class Solution {
    public int minLength(String s) {
       Stack<Character> st = new Stack<>() ; 
       st.push(s.charAt(0)) ; 
       int i = 1 ; 
       int x = s.length() ;
       while(i<x){
        boolean flag = true ; 
         char s2 = s.charAt(i) ;
        if(st.size()>0){
           char s1 = st.peek() ; 
            if((s1=='A'&&s2=='B')||(s1=='C'&&s2=='D')){
               // System.out.println(st.peek()+" in") ;
                st.pop() ; 
                flag = false ;
            }
        }
            if(flag) 
            st.push(s2) ;
//System.out.println(st.peek()+" out") ;
            i++ ; 
       }
       return st.size() ;


    }
}