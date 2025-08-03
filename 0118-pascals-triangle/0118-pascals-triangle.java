class Solution {
    int MOD = 1_000_000_007;
    public int pow(long a,long b){
        long result = 1 ; 
        while(b>0){
            if((b&1)==1){
                result = (result*a)%MOD ; 
            }
            a = (a*a)%MOD ; 
            b >>=1 ;
        }
        return (int)result ;
    }
    public int nCr(int n ,int r){
        long ans = 1 ;
        for(int i=0;i<r;i++){
            ans = (ans*(n-i))%MOD ; 
            ans = (ans*pow(i+1,MOD-2))%MOD ; 
        }
        return (int)ans ; 
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>()) ; 
            for(int j=0;j<=i;j++){
                ans.get(i).add(nCr(i,j)) ;
            }
        }
        return ans ;
    }
}