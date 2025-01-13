class Solution {
    public boolean makeStringsEqual(String s, String target) {
        int one = 0 ; 
        int extone = 0 ;
        int extzero = 0 ; 
        int zero = 0 ;
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)!=target.charAt(i)){
                if(s.charAt(i)=='1'){
                    extone++ ;
                }else extzero++ ;
            }
            if(target.charAt(i)=='0'){
                zero++ ;
            }
            if(s.charAt(i)=='1'){
                one++ ;
            }
        }
       // System.out.println(one+" "+extzero+" "+extone);
        if(one==0&&(extzero!=0||extone!=0)){
            return false ;
        }
        if(one!=0&&zero==target.length()){
            return false ;
        }
        return true ;
    }
}