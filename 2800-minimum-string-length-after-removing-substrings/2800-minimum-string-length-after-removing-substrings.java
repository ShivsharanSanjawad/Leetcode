class Solution {
    public boolean isok(char s1, char s2){
        return (s1=='A'&&s2=='B')||(s1=='C'&&s2=='D') ;
    }
    public int minLength(String s) {
       Stack<Character> st = new Stack<>() ; 
       st.push(s.charAt(0)) ; 
       int i = 1 ; 
       while(i<s.length()){
        boolean flag = true ; 
        if(st.size()>0)
            if(isok(st.peek() ,s.charAt(i))){
               // System.out.println(st.peek()+" in") ;
                st.pop() ; 
                flag = false ;
            }
            if(flag) 
            st.push(s.charAt(i)) ;
//System.out.println(st.peek()+" out") ;
            i++ ; 
       }
       return st.size() ;


    }
}