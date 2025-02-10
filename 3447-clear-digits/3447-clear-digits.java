class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>() ; 
        for(int i = 0 ;i<s.length();i++){
            if(!(s.charAt(i)>96&&s.charAt(i)<127)){
                st.pop() ; 
            }else st.push(s.charAt(i)); 
        }
        StringBuilder sb = new StringBuilder() ; 
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse() ;
        return sb.toString();
    }
}