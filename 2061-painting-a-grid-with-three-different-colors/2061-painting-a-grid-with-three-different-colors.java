class Solution {
    long mod = 1000000007 ;
    ArrayList<int[]> x = new ArrayList<>() ; 
    long [][] dp ;
    public int colorTheGrid(int m, int n) {
        int a[] = new int[m+1] ; 
        a[m] = -1 ;
        getAll(m-1,a);  
        dp = new long[n+1][x.size()+1] ; 
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        long total = 0 ; 
        for(int i=0;i<x.size();i++){
            total = (total + get(n-1,i))%mod ;
        }
        return (int)total ;
    }

    public void getAll(int m,int[]a){
        if(m<0){
            x.add(a.clone()) ; 
            return ;
        }
        for(int i=1;i<4;i++){
            if(a[m+1]!=i){
                a[m] = i ; 
                getAll(m-1,a) ;
            }
        }
    }

    public long get(int n, int prevIdx){
        if(n==0){
            return 1 ;
        }
        if(dp[n][prevIdx]!=-1){
            return dp[n][prevIdx];
        }
        int [] prev = x.get(prevIdx) ;
        long total = 0 ; 
        for(int i=0;i<x.size();i++){
            int [] temp = x.get(i); 
            boolean flag = true ;
            for(int j=0;j<prev.length-1;j++){
                if(temp[j]==prev[j]){
                    flag  = false ; 
                    break;
                }
            }
            if(flag){
                total = (total+ get(n-1,i))%mod ;
            }
        }
        return dp[n][prevIdx] = total;
    }
}