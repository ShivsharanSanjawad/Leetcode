class Solution {
    public int get(String s){
            int x = ((s.charAt(0) - '0')*10 + s.charAt(1) -'0')*60 + (s.charAt(3)-'0')*10 + s.charAt(4) -'0' ;  
            return x;
    }
    public int findMinDifference(List<String> timePoints) {
        if((timePoints.size())>1440){
            return 0 ; 
        }
        Collections.sort(timePoints);
           // System.out.println(timePoints) ;
        int min = Integer.MAX_VALUE ;
        int i ; 
        for( i = 1 ; i<timePoints.size() ; i++){
        int x = get(timePoints.get(i)) - get(timePoints.get(i-1)) ;
        if(x>720){
            x = 1440 - x ; 
        }
        if(x<min){
            min =x ; 
        }

        }
         int x = get(timePoints.get(i-1)) - get(timePoints.get(0)) ;
        if(x>720){
            x = 1440 - x ; 
        }
        if(x<min){
            min =x ; 
        }
            return min;
        
    }
}