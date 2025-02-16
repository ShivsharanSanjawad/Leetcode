class Solution {
    int a[] ;
    boolean used[] ;
    public int[] constructDistancedSequence(int n) {
        a = new int[2*n-1] ; 
        Arrays.fill(a,-1);
        used = new boolean[n+1] ;
        solve(0,n);
        return a ;
    }

    public boolean solve(int i,int n){
        if(i>=a.length) return true ;
        if(a[i]!=-1){
            return solve(i+1,n);
        }
        for(int x=n;x>0;x--){
            if(used[x]) continue ;
            a[i] = x ;
            used[x] = true ;
            if(x==1){
                if(solve(i+1,n)){
                    return true ;
                }
            }else{
                int j = i+x ;
                if(j<a.length&&a[j]==-1){
                    a[j] = x ; 
                    if(solve(i+1,n)){
                        return true ;
                    }
                    a[j] = -1 ; 
                }
            }
            a[i] = -1 ;
            used[x] = false ;
        }
        return false ;
    }


}