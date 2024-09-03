class Solution {
    public int isOperator(String s){
        if(s.equals("+"))
        return 0 ; 
        if(s.equals("-")) 
        return 1 ;
        if(s.equals("*"))
        return 2 ; 
        if(s.equals("/"))
        return 3 ;
        return -1 ;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> ans = new Stack<>() ; 
        for(int i = 0 ; i<tokens.length ;i++){
            int a = isOperator(tokens[i]) ;
            if(a<0){
                ans.push(Integer.parseInt(tokens[i])) ;
             }else{
                int y = ans.pop() ; 
                int x = ans.pop() ;
                if(a==0){
                    ans.push(x+y) ; 
                }else if(a==1){
                    ans.push(x-y) ;
                }else if(a==2){
                    ans.push(x*y) ;
                }else if(a==3){
                    ans.push(x/y) ;
                 }
             }
        }
        return ans.pop() ;
    }
}