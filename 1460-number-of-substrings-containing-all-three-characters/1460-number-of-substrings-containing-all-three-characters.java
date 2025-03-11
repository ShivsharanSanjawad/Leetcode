class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0 ; 
        int a[] = new int[3] ; 
        int i = 0 ; 
        int j = 3 ; 
        a[s.charAt(0)-'a']++ ; 
        a[s.charAt(1)-'a']++ ; 
        a[s.charAt(2)-'a']++ ; 
        while(j<s.length()){
            while(a[0]>0&&a[1]>0&&a[2]>0){
                count += s.length() - j + 1 ; 
                a[s.charAt(i)-'a']-- ; 
                i++ ;
            }
            a[s.charAt(j)-'a']++ ;
            j++ ;
        }
        while(a[0]>0&&a[1]>0&&a[2]>0){
                count += s.length() - j+1 ; 
                a[s.charAt(i)-'a']-- ; 
                i++ ;
        }
        return count ;
    }
}