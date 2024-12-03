class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder x = new StringBuilder() ; 
        int z = 0 ; 
        for(int i= 0 ; i<spaces.length ;i++){
            int j = z ;
            while(j<spaces[i]){
                x.append(s.charAt(j++)) ;  
            }
            x.append(" ") ;
            z = spaces[i] ;
        }
        x.append(s.substring(z,s.length()));
        return x.toString() ;
    }
}