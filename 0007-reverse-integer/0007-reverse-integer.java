import java.util.* ; 
import java.math.* ;
class Solution {
public  int reverse(int x) {
    StringBuffer s = new StringBuffer().append("2") ;
    long y ; 
    boolean negative = false ; 
    if(x<0)
    negative = true ; 
         try{
                if(x<0)
          s     = new StringBuffer().append(Integer.toString(-x)) ;
               else 
           s = new StringBuffer().append(Integer.toString(x)) ; 
         }catch(Exception e){
            
            y = x ; 
            if(x<0)
                 s = new StringBuffer().append(Long.toString(-y)) ; 
try{
                return -1*(int)Long.parseLong(s.reverse().toString()) ; 
}catch(Exception f){
   return 0 ; 
}

         }
          try {
            if(negative){
                x = -1 ; 
            }
            else x = 1 ; 
            return  x*Integer.parseInt((s.reverse().toString())) ; 


          }catch(Exception e){
            return 0 ; 
          }
        
            }
}