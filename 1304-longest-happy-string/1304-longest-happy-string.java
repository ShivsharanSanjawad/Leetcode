class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder s= new StringBuilder() ; 
        int currA = 0 ; 
        int currB = 0 ; 
        int currC = 0 ; 
        int x = a+b+c ;
        for(int i = 0 ;i<x ; i++)
        {
            if(((currB==2||currC==2)&&a>0)||((a>=b)&&(a>=c) &&currA!=2)){
                s.append('a') ;
                a-- ; 
                currB = 0 ; 
                currC = 0 ; 
                currA ++ ; 
            }
            else if( ((currC==2||currA==2)&&b>0)||((b>=a)&&(b>=c)&&currB!=2)){
                s.append('b') ; 
                b-- ; 
                currC = 0 ; 
                currA = 0 ; 
                currB ++ ;
            }else if(((currA==2||currB==2)&&c>0)||((c>=a)&&(c>=b)&&currC!=2)){
                s.append('c') ; 
                c-- ; 
                currA = 0 ; 
                currB =0 ; 
                currC++; 
            }
        }
        return s.toString() ;
    }
}