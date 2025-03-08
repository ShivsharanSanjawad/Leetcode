class Solution {
    public int minimumRecolors(String s, int k) {
        int count = 0 ;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='B'){
                count++ ;
            }
        }
        int max = count ;
        if(max>=k) return 0 ; 
        for(int j=k;j<s.length();j++){
           if(s.charAt(j-k)=='B'&&s.charAt(j)!='B'){
                count--;
           }
           if(s.charAt(j)=='B'&&s.charAt(j-k)!='B'){
                count++ ; 
           }
           if(count>max){
              max = count ;
           }
        }
        if(max>k){
            max = k;
        }
        return k-max ;
    }
}