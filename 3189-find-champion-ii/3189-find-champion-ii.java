class Solution {
    public int findChampion(int n, int[][] edges) {
        int a[] = new int[n] ; 
        Arrays.fill(a,0);
        for(int i = 0 ; i<edges.length ; i++){
            a[edges[i][1]] = 1 ; 
        }
        int count = 0 ; 
        int id = -1 ;
        for(int i = 0 ; i<a.length ;i++){
            if(a[i]==0){
                id  = i ; 
                count ++ ;
            }
        }
        if(count!=1){
            id = -1 ;
        }
        return id ;
    }
}