class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
       int a[] = new int[s.length()] ;
       for(int i = 0 ; i<shifts.length;i++){
            int x = shifts[i][0] ; 
            int y = shifts[i][1] ; 
            int d  = shifts[i][2] ; 
            if(d==1){
                a[x]++ ; 
                if(y+1<a.length){
                    a[y+1]-- ;
                }
            }else{
                a[x]-- ; 
                if(y+1<a.length){
                    a[y+1]++ ;
                }
            }
       }
       for(int i =1 ;i<a.length;i++){
            a[i] += a[i-1] ;
       }
       char c[] = new char[a.length] ; 
       for(int i =0 ; i<c.length;i++){
            c[i] = (char)((s.charAt(i) - 'a' + (a[i])%26 + 26)%26 + 97) ;
       }
       return new String(c);
    }
}