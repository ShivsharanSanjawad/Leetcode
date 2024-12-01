class Solution {
    public boolean isok(char s){
        return ((s-'0')>=0&&(s-'0')<=9) ;
    }
    public String solveEquation(String s) {
        int xsum = 0 ; 
        int csum = 0 ; 
        char prev = '+' ;
        char xprev = '0' ;
        boolean flag = true;
        int num = 1;
        for(int i = 0 ; i<s.length() ;){
            if(s.charAt(i)=='x'){
                if(prev=='+'){
                    xsum+= num ; 
                }else xsum-= num;
                i++ ;
                num = 1 ;
                continue ;
            }
            if(s.charAt(i)=='='){
               prev  = '-' ;
               flag = false;
               i++ ;
               continue ;
            }
            if(s.charAt(i)=='+'){
                if(flag)
                prev = '+' ;
                else
                prev = '-' ;
                i++ ;
                continue ;
            }
            if(s.charAt(i)=='-'){
                if(flag)
                prev = '-' ;
                else 
                prev = '+';
                i++ ;
                continue ;
            }
            int j = i ;
            int x= 0 ; 
            while(j<s.length()&&isok(s.charAt(j))){
                x = x*10  ;
                x+= s.charAt(j);
                x-='0' ;
                j++ ;
            }
            if(j<s.length()){
                if(s.charAt(j)!='x'){
                     if(prev=='+'){
                            csum -=(x);
                        }else{
                            csum +=(x) ;
                        }
                        num  = 1 ;
                }else{
                    num  = x ;
                }
                i = j ;
            }else{
                 if(prev=='+'){
                            csum -=(x) ;
                        }else{
                            csum +=(x) ;
                        }
                        num = 1;
                    i = j ; 
            }  
        }
     //   System.out.println(xsum+"x="+csum) ;
        if((xsum==0)&&csum==0){
            return "Infinite solutions" ;
        }else if(xsum==0){
            return "No solution" ;
        }
        if(csum==0){
            return "x=0" ;
        }
        return "x="+((csum/xsum)) ;
    }
}