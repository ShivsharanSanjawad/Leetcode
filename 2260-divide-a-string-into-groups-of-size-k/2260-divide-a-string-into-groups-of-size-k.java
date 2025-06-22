class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length() ; 
        String a[] = new String[(n+k-1)/k] ;
        for(int i=0;i<n;i+=k){
            if(i+k>n){
                a[i/k] = s.substring(i,n) ;
                continue ;
            }
            a[i/k] = s.substring(i,i+k) ;
        }
        if(a[(n+k-1)/k-1].length()!=k){
            int x = k - a[(n+k-1)/k-1].length() ; 
            a[(n+k-1)/k-1] += (fill+"").repeat(x);
        }
        return a ;
    }
}