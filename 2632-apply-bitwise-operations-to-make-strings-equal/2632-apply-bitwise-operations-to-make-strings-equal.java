class Solution {
    // a simple idea is if i have one is s i can do whatever i want except that making all 
    // terms to zero .. 
    // so i can simply say that if i have 1 but if target don't have then false and vice versa too . 
    // so other solution can be s.contains("1")==target.contains("1");
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