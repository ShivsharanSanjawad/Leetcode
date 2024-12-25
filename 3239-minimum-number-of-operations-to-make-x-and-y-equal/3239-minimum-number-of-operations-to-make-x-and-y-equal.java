class Solution {
    HashMap<Integer,Integer> dp ;
    public int minimumOperationsToMakeEqual(int x, int y) {
        if(y>x){
            return y-x;
        }
        dp= new HashMap<>() ; 
        return get(x,y);
    }
    public int get(int x,int y){
        if(y>=x){
            return y-x;
        }
        if(dp.containsKey(x)){
            return dp.get(x);
        }
        int ans= x-y ;
        ans = Math.min(ans , 1+x%5+get(x/5 , y)) ;
        ans = Math.min(ans , 6-x%5+get(x/5+1,y)) ; 
        ans = Math.min(ans ,1+x%11+get(x/11,y)) ;
        ans = Math.min(ans,12-x%11+get(x/11 +1 ,y)) ;
        dp.put(x,ans) ;
        return ans ;
    }
}