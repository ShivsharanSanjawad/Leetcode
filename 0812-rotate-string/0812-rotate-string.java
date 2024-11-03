class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        if(s.length()!=goal.length()){
            return false ;
        }
        String x = ""+ goal.charAt(goal.length()-1);
        x += goal.charAt(0) ;
        if(!s.contains(x))
        return false ;
        x = ""+s.charAt(goal.length()-1) ; 
        x+=s.charAt(0); 
        if(!goal.contains(x)){
            return false ;
        }
        return true ;
    }
}