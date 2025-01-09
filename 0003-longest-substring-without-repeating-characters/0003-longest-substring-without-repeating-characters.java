class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0 ;
        int [] a = new int[128];
        int start = 0 ;
        for(int i = 0 ;i<s.length() ;i++){
            int x = s.charAt(i)  ; 
            while(a[x]!=0){
                a[s.charAt(start)] =0 ;
                start++ ;
            }
            a[x] = 1;
            int len = i-start+1 ;
            if(len>max){
                max = len ;
            }
        }
        return max ;
    }
}