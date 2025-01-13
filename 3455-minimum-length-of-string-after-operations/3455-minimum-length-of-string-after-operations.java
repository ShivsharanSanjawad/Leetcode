class Solution {
    public int minimumLength(String s) {
        int a[] = new int[26] ;
        for(int i = 0 ;i<s.length();i++){
            int x = s.charAt(i) -'a' ; 
            a[x]++ ;
        }
        int count = s.length() ;
        for(int i=0 ; i<26;i++){
            if(a[i]>=3){
                int x = (a[i]-3)/2 ;
                count -= (x+1)*2 ;
            }
        }
        return Math.abs(count) ;
    }
}