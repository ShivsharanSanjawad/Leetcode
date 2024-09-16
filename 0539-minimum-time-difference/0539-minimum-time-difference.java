class Solution {
    public int findMinDifference(List<String> timePoints) {
        if((timePoints.size())>1440){
            return 0 ; 
        }
        Collections.sort(timePoints);
           // System.out.println(timePoints) ;
        int min = Integer.MAX_VALUE ;
        int i ; 
        for( i = 1 ; i<timePoints.size() ; i++){
        int x = (Integer.parseInt(timePoints.get(i).substring(0,2)) - Integer.parseInt(timePoints.get(i-1).substring(0,2)))*60 + 
                Integer.parseInt(timePoints.get(i).substring(3,5)) - Integer.parseInt(timePoints.get(i-1).substring(3,5)) ;
        if(x>720){
            x = 1440 - x ; 
        }
        if(x<min){
            min =x ; 
        }

        }
        int x = (Integer.parseInt(timePoints.get(i-1).substring(0,2)) - Integer.parseInt(timePoints.get(0).substring(0,2)))*60 + 
                Integer.parseInt(timePoints.get(i-1).substring(3,5)) - Integer.parseInt(timePoints.get(0).substring(3,5)) ;
        if(x>720){
            x = 1440 - x ; 
        }
        if(x<min){
            min =x ; 
        }
            return min;
        
    }
}