import java.util.*;
class Solution {
    public boolean perform(char s , char t,char operation){
        if(s!='t'&&s!='f'){
            return t=='t'?true:false ;
        }
        if(operation=='&'){
            return s=='t'&&t=='t' ;
        }
        if(operation=='|'){
            return s=='t'||t=='t' ;
        }
        if(operation=='!'){
            return s=='t'?false:true;
        }
        return t=='t'?true:false;
    }
    public boolean parseBoolExpr(String s) {
        Stack<Character> st = new Stack<>() ;
        int n = s.length()-1;

        for(int i = n ;i>=0 ; i--){
            if(s.charAt(i)=='|'||s.charAt(i)=='&'||s.charAt(i)=='!'){
                boolean curr = s.charAt(i)=='|'?false:true ;
                while(!st.isEmpty()&&st.peek()!=')'){
                    curr = perform(st.pop(),curr==true?'t':'f',s.charAt(i)) ;
                }
                st.pop();
                st.push(curr==true?'t':'f') ;
            }else if(s.charAt(i)==','){
                continue ;
            }else
            st.push(s.charAt(i));
        }
        boolean curr = st.peek()=='t'?true:false;
        if(st.size()!=1){
            if(st.peek()=='&'||st.peek()=='|'){
                char x = st.peek() ;
                curr = true ;
                while(!st.isEmpty()){
                    curr = perform(st.pop(),curr==true?'t':'f',x);
                }
            }
        }
        return curr ;
    }
  
}