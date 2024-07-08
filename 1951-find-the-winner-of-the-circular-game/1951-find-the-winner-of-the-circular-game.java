class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> a = new ArrayList<>(); 
        for(int i = 1 ; i<=n ; i++){
            a.add(i);
        }
        int x = 0 ; 
        while(a.size()>1){
            n = a.size() ; 
            x = x+ k ; 
            a.remove((x-1)%n); 
         
            x = ((x-1)%n ) ;
            if(x==(n-1)){
                x = 0 ;
            }
        }
        return a.get(0);
    }
}