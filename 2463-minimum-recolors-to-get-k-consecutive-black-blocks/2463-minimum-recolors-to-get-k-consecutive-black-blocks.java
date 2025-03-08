class Solution {
    public int minimumRecolors(String s, int k) {
        int min = Integer.MAX_VALUE ; 
        for(int i=0;i<=s.length()-k;i++){
            int count = 0 ;
            for(int j=i;j<i+k;j++){
                if(s.charAt(j)=='B'){
                    count++ ;
                }
            }
            int x = k-count ; 
            if(x==0){
                return 0 ;
            }
            if(min>x){
                min = x;
            }
        }
        return min ;
    }
}