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
            for(int j=i+1;j<points.length;j++){
                if(i==j){
                    continue ; 
                }
                if(points[i][0]!=points[j][0]&&points[i][1]<points[j][1]){
                    continue ;
                }
                boolean flag = true ; 
                for(int k=0;k<points.length;k++){
                    if(k==i||k==j) continue ;
                    if((points[k][0]>=points[i][0]&&points[k][0]<=points[j][0])&&(points[k][1]<=points[i][1]&&points[k][1]>=points[j][1])){
                        flag = false ; 
                        break ;
                    }
                }
                if(flag){
                    count++ ;
                }
            }
        }
        return count ;
    }
}