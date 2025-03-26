class Solution {
    public int minCostConnectPoints(int[][] points) {
        boolean visited[] = new boolean[points.length] ; 
        PriorityQueue<int[]> q = new PriorityQueue<>((x,y)->x[0]-y[0]) ; 
        q.offer(new int[]{0,0}) ; 
        int count = 0 ;
        int sum = 0 ;
        while(!q.isEmpty()&&count<points.length){
            int a[] = q.poll() ; 
            if(!visited[a[1]]){
                sum += a[0] ; 
                visited[a[1]] = true ;
                for(int i=0;i<points.length;i++){
                if(!visited[i]){
                    int d = (int) Math.abs((points[a[1]][1]-points[i][1])) +(int) Math.abs((points[a[1]][0]-points[i][0])) ; 
                    q.offer(new int[]{d,i}) ;
                }
            }
            count++ ;
            }
        }
        return sum ;
    }
}