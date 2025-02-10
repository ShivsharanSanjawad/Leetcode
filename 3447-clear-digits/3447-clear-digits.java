class Solution {
    public String clearDigits(String s) {
        char [] ans = new char[s.length()+1];
        int x = 0 ;
        for(int i=0 ;i<s.length();i++){
            if(s.charAt(i)>96&&s.charAt(i)<127){
                ans[x++] = s.charAt(i);
            }else { 
                if(x>0){
                    x-- ;
                }
            } 
        }
        return new String(Arrays.copyOfRange(ans,0,x)) ;
    }
}