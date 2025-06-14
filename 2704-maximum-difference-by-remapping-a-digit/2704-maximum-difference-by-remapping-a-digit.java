class Solution {
    public int minMaxDifference(int num) {
        int max = num ; 
        int min = 0; 
        String x = Integer.toString(num) ; 
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)!='9'){
                String y = x.replace(x.charAt(i),'9');
                max = Integer.parseInt(y) ;
                break ;
            }
        }
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)!='0'){
               String y = x.replace(x.charAt(i),'0');
               min = Integer.parseInt(y);
               break ;
            }
        } 
        return max-min;
    }
}