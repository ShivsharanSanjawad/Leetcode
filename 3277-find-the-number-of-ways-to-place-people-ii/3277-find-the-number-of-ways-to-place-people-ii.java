class Solution {
     public int numberOfPairs(int[][] points) {
        Arrays.sort(points,(x,y)->{
            if(x[0]!=y[0]){
                return Integer.compare(x[0],y[0]);
            }
            return Integer.compare(y[1],x[1]);
        });
        int count = 0  ;
        for(int i=0;i<points.length;i++){
            int maxY = Integer.MIN_VALUE ; 
            for(int j=i+1;j<points.length;j++){
                if(points[j][1]>maxY&&points[j][1]<=points[i][1]){
                    count++ ; 
                    maxY = points[j][1] ;
                }
            }
        }
        return count ;
    }
}