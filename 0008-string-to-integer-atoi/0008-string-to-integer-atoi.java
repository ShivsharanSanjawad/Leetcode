class Solution {
    public int myAtoi(String s) {
        double x  = 0 ;
        s = s.stripLeading();
        boolean flag2 = false ;
        boolean flag = false ;
        for(int i =0 ; i<s.length() ; i++){
            if(s.charAt(i)=='+'){
                if(flag2==false){
                flag = false ;
                flag2 = true ;
                }
                else 
                break ;
                continue ;
            }
            if(s.charAt(i)=='-'){
                if(flag2==false){
                flag = true ; 
                flag2 = true ;
                }
                else break ;
                continue ;
            }
            int z = s.charAt(i) -'0';
            if(z<10&&z>=0){
                x = x*10 + z ;
                flag2 = true ;
            }else 
            break ;
        }
        if(flag)
        x = -x ;
        if(x>Integer.MAX_VALUE){
            x = 2147483647 ;
        }
        if(x<Integer.MIN_VALUE){
            x = -2147483648 ; 
        }
        return (int)x ;
    }
}