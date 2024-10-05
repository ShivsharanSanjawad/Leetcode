class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a[] = new int[26] ;
        for(int i =0 ; i<s1.length() ; i++){
            a[s1.charAt(i)-'a'] +=1 ;
        }
        int i = 0 ; 
        int k = s1.length() ;
        int b[] = new int[26] ; 
        int z = s2.length() ;
        while(i<s2.length()){
            boolean flag = true ;
            for(int j = i ; j<i+k &&j<z ; j++){
                b[s2.charAt(j)-'a'] +=1 ; 
            }
            for(int x = 0 ; x<26 ; x++){
                if(a[x]!=b[x]){
                    flag = false ;
                    break ; 
                }
            }
            if(flag){
                return true ;
            }
                i++ ;
            Arrays.fill(b,0);
        }
        return false ;
    }
}