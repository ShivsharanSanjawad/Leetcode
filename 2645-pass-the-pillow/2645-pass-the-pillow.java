class Solution {
    public int passThePillow(int n, int time) {
        int i = 0 ;
        int d = 1 ; 
        while(time>0){
            if(((i==n-1)&&d==1)||(i==0&&d==-1))
            d = -1 *d ;
            if(d==1)
            i++ ;
            else 
            i-- ;

            time-- ;
        }
        return i+1 ;
    }
}