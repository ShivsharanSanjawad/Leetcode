class Solution {
    long MOD = 1000000007L ;
    HashMap<String,Integer> h ; 
    public int numRollsToTarget(int n, int k, int target) {
        h = new HashMap<>() ;
        return get(n,k,target,0);
    }
    public int get(int n , int k , int target , int sum){
        if(n==0){
            return sum==target?1:0 ;
        }
        if(h.containsKey(n+" "+sum)){
            return h.get(n+" "+sum) ;
        }
        long curr = 0 ; 
        for(int i = 1  ; i<=k ;i++){
            curr =(curr +get(n-1,k,target,sum+i))%MOD ;
        }
        h.put(n+" "+sum,(int)(curr%MOD)) ;
        return (int)(curr%MOD);
    }
}