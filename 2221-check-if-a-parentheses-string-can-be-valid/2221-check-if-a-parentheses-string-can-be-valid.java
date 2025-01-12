class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2==1){
            return false ;
        }
        Stack<Integer> open = new Stack<>() ; 
        Stack<Integer> lock = new Stack<>() ; 
        for(int i = 0 ;i<s.length();i++){
             if(locked.charAt(i)=='0'){
                lock.push(i) ; 
                continue ;
            }
            if(s.charAt(i)=='('){
                open.push(i) ;
            }
            if(s.charAt(i)==')'){
                if(!open.isEmpty()){
                    open.pop() ;
                }else if(!lock.isEmpty()){
                    lock.pop() ;
                }else{
                    return false ;
                }
            }
        }
        while(!open.isEmpty()&&!lock.isEmpty()&&open.peek()<lock.peek()){
            open.pop() ; 
            lock.pop();
        }   
        if(!open.isEmpty()){
            return false ;
        }
        return true ;
    }
}