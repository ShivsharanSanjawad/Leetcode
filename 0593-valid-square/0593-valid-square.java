class Solution {
    public double distance(int []p , int[]q){
        return (((q[1]-p[1])*(q[1]-p[1]))+((q[0]-p[0])*(q[0]-p[0]))) ;

    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double[] d = new double[]{
            distance(p1, p2),
            distance(p1, p3),
            distance(p1, p4),
            distance(p2, p3),
            distance(p2, p4),
            distance(p3, p4)
        };
        Arrays.sort(d); 
        if(d[0]!=d[1]){
            return false ; 
        }
        if(d[1]!=d[2]){
            return false ;
        }
        if(d[2]!=d[3]){
            return false ;
        }
        if(d[4]!=d[5]){
            return false ;
        }
        if(d[4]!=d[3]*2){
            return false ;
        }
        for(int i = 0 ;i<6 ;i++){
            if(d[i]==0)
            return false ;
        }
        
        return true ;
        
        
    }
}