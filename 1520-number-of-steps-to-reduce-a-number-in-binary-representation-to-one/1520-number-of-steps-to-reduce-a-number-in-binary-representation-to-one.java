class Solution {
     public  int numSteps(String s) {
        int x = 0 ; 
        while(!(s.length()==1&&s.charAt(0)=='1')){
            if(s.charAt(s.length()-1)=='0'){
                s = s.substring(0,s.length()-1) ;
            }else{
                int y = s.length()-1 ; 
                String z = "1" ;
                while(y>-1&&s.charAt(y)!='0'){
                    y-- ;
                }
                int temp = y ;
                if(temp==-1)
                temp = 0 ;
                while(s.length()-y-1>0){
                    z = z +"0";
                    y++ ;
                }
                s = s.substring(0,temp) ; 
                s = s+z ;
            }
            x++ ;
        }
        return x;
}
}