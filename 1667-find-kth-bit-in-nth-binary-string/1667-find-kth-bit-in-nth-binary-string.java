class Solution {
    public char findKthBit(int n, int k) {
        char a[] = new char[(1<<n)-1];
        a[0] = '0';
        int x = 1 ;
        for(int i = 0 ; i<a.length-x; i+=x){
            int j =0 ; 
            a[i+1] = '1';
            for( j = 0 ; j<(i>>1) ; j++){
                a[j+i+2] =a[j] ; 
            }
            a[j+i+2] = a[j]=='0'?'1':'0';
            j++ ;
            for(;j<=i;j++){
                a[j+i+2] = a[j] ; 
            }
            x = x<<1;
        }
       // System.out.println(Arrays.toString(a));
        return a[k-1] ;
    }

}