class Solution {
    public String pushDominoes(String d) {
        char c[] = new char[d.length()] ;
        int [] left = new int[d.length()] ; 
        int x =  -1; 
        int [] right = new int[d.length()];
        int y = -1 ; 
        for(int i=0;i<d.length();i++){
            if(d.charAt(i)=='R'){
                x = i ;
            }
            if(d.charAt(i)=='L'){
                x = -1 ; 
            }
            right[i] = i-x; 
            if(x==-1){
                right[i] = Integer.MAX_VALUE ; 
            } 
        }
        for(int i=d.length()-1;i>=0;i--){
            if(d.charAt(i)=='L'){
                y = i ;
            }
            if(d.charAt(i)=='R'){
                y = -1 ;
            }
            left[i] = y-i ;
            if(y==-1){
                left[i] = Integer.MAX_VALUE ; 
            } 
        }
        for(int i=0;i<d.length();i++){
            if(d.charAt(i)=='.'){
                if(left[i]==right[i]){
                    c[i] = '.' ;
                }else if(left[i]<right[i]){
                    c[i] ='L' ;
                }else c[i] ='R' ; 
            }else {
                c[i] = d.charAt(i) ;
            }
        }
        return new String(c) ;
    }
}