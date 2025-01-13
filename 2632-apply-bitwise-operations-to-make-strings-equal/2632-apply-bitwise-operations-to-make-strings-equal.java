class Solution {
    public boolean makeStringsEqual(String s, String target) {
        int one = 0 ; 
        int zero = 0 ;
        for(int i = 0 ; i<s.length();i++){
            if(target.charAt(i)=='0'){
                zero++ ;
            }
            if(s.charAt(i)=='1'){
                one++ ;
            }
        }
       // System.out.println(one+" "+extzero+" "+extone);
        if(one==0){
            return s.equals(target);
        }
        if(one!=0&&zero==target.length()){
            return false ;
        }
        return true ;
    }
}