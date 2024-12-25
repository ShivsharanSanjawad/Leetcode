class Solution {
    ArrayList<ArrayList<Integer>> e1;
    ArrayList<ArrayList<Integer>> e2;
    public int get(List<ArrayList<Integer>> e, int i) {
    
    int[] x = bfs(e, i);
    int j=x[0];
    int[] ans = bfs(e,j);
    return ans[1];
}

private int[] bfs(List<ArrayList<Integer>> e, int startNode) {
    Queue<Integer> q = new LinkedList<>();
    q.add(startNode);

    boolean[] visited = new boolean[e.size()];
   
    int[] distance = new int[e.size()];
    Arrays.fill(distance, -1);

    visited[startNode] = true;
    distance[startNode] = 0;

    int farthestNode = startNode;
    int maxDistance = 0;

    while (!q.isEmpty()) {
        int currentNode = q.poll();
        for (int neighbor : e.get(currentNode)) {
            if (!visited[neighbor]) {
                q.add(neighbor);
                visited[neighbor] = true;
                distance[neighbor] = distance[currentNode] + 1;
                if (distance[neighbor] > maxDistance) {
                    maxDistance = distance[neighbor];
                    farthestNode = neighbor;
                }
            }
        }
    }

    return new int[]{farthestNode, maxDistance};
}
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        if(edges1.length==0&&edges2.length==0){
            return 1;
        }
        
        e1 = new ArrayList<>() ; 
        e2 = new ArrayList<>() ; 
        HashSet<Integer> h = new HashSet<>() ; 
        for(int i = 0 ; i<edges1.length;i++){
            h.add(edges1[i][0]) ; 
            h.add(edges1[i][1]) ; 
        }
        for(int i = 0 ; i<h.size() ; i++){
            e1.add(new ArrayList<>()) ;
        }
        h = new HashSet<>() ; 
        for(int i = 0 ; i<edges2.length;i++){
            h.add(edges2[i][0]) ; 
            h.add(edges2[i][1]) ; 
        }
        for(int i = 0 ; i<h.size() ; i++){
            e2.add(new ArrayList<>()) ;
        }
        for(int i = 0 ; i<edges1.length;i++){
            e1.get(edges1[i][0]).add(edges1[i][1]);
             e1.get(edges1[i][1]).add(edges1[i][0]);
            
        }
        for(int i = 0 ; i<edges2.length;i++){
            e2.get(edges2[i][0]).add(edges2[i][1]);
            e2.get(edges2[i][1]).add(edges2[i][0]);
        }
        if(edges1.length==0){
            return (int)Math.ceil(get(e2,0)/2.0)+1 ;
        }
        if(edges2.length==0){
            return (int)Math.ceil(get(e1,0)/2.0) +1;
        }
        return Math.max((int)Math.ceil(get(e1,0)/2.0) + (int)Math.ceil(get(e2,0)/2.0) +1  , Math.max(get(e1,0),get(e2,0))) ;
    }
}