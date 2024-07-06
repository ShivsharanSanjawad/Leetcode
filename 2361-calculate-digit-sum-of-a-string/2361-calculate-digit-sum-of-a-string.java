class Solution {
     public static int find(String s){
            int temp = 0 ; 
            for(int i = 0  ;i<s.length(); i++){
                temp = temp + s.charAt(i) - 48 ; 
            }
            return temp ;
        }

        public   String digitSum(String s, int k) {
            String temp = "" ; 
            int x ;
            int i = 0 ;
            while(s.length()>k){
                temp  = "" ;
                        x = s.length() ; 
                        i = 0 ;
                        while(x>k){
                            temp = temp + Integer.toString(find(s.substring(i , i+k)));
                            i = i+ k; 
                            x = x- k ;
                        }

                        temp = temp + Integer.toString(find(s.substring(i, s.length()))) ;
                       s = temp ; 
            }
          return s ; 

        }


}