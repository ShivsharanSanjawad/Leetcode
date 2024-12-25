class Solution {
    HashMap<Integer,Integer> h ;
    public int minimumOperationsToMakeEqual(int x, int y) {
        if(y>x){
            return y-x;
        }
        h = new HashMap<>() ; 
        return get(x,y);
    }
    public int get(int x,int y){
        if(y>=x){
            return y-x;
        }
        if(h.containsKey(x)){
            return h.get(x);
        }
        int ans= x-y ;
        ans = Math.min(ans , 1+x%5+get(x/5 , y)) ;
        ans = Math.min(ans , 6-x%5+get(x/5+1,y)) ; 
        ans = Math.min(ans ,1+x%11+get(x/11,y)) ;
        ans = Math.min(ans,12-x%11+get(x/11 +1 ,y)) ;
        h.put(x,ans) ;
        return ans ;
    }
}