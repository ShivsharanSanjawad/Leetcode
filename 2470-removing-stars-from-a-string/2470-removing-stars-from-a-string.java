class Solution {
    public String removeStars(String s) {
        Stack<Character> x = new Stack<>() ; 
        for(int i = 0 ;i<s.length() ; i++){
            x.push(s.charAt(i)) ;
        }
        s = "" ; 
        while(x.size()>0){
            if(x.peek()!='*'){
                s =  String.valueOf(x.pop()) + s ;
            }else{
                int z =  0 ; 
                while(x.peek()=='*'){
                    z++ ; 
                    x.pop() ; 
                }
                while(z>0){
                    z-- ; 
                    if(x.peek()=='*')
                    z+=2 ;
                    x.pop();
                }
            }
        }
        return s ;
    }
}