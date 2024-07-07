class Solution {
    public double findDistance(int x1, int y1 , int x2, int y2){
        double ans = Math.pow(x2-x1,2)+Math.pow(y2-y1,2) ;
        return Math.sqrt(ans) ; 
    }
    public boolean compareDistance(int x1 , int y1 , int x2 , int y2 , int radius){
        return radius>=findDistance(x1, y1 , x2, y2) ; 
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int answers[] = new int[queries.length] ; 
        for(int i = 0 ; i<queries.length ; i++){
            for(int j =0  ; j<points.length ; j++){
                if(compareDistance(queries[i][0],queries[i][1],points[j][0], points[j][1],queries[i][2]))
                answers[i]++ ; 
            }
        }
        return answers ; 
    }
}