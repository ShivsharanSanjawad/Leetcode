class Solution {
    public int numEquivDominoPairs(int[][] d) {
       // HashMap<Integer,Integer> h = new HashMap<>() ; 
       // ha yes mai hashmap use kar raha tha , but yes we can use array too simply 
       int a[] = new int[100] ;
       Arrays.fill(a,-1);
        for(int i=0;i<d.length;i++){
            int x = d[i][0]*10 + d[i][1] ; 
            int y = d[i][1]*10 + d[i][0] ; 
            if(a[x]!=-1){
                a[x]++ ;
            }else{
                if(a[y]==-1){
                    a[y] = 0 ;
                }
                a[y]++ ;
            }
        }
        int count = 0 ; 
        for(int i=0;i<100;i++){
            if(a[i]==-1){
                continue ;
            }
            count += a[i]*(a[i]-1)/2 ;
        }
        return count ;
    }
}