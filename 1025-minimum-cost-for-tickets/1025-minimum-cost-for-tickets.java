class Solution {
    int [] dp ; 
    public int mincostTickets(int[] days, int[] costs) {
        dp =  new int[days.length] ; 
        Arrays.fill(dp,-1) ;
        return get(days,0,costs);
    }
    public int get(int []days ,int i,int [] costs){
        if(i>=days.length){
            return 0 ; 
        }
        if(dp[i]!=-1){
            return dp[i] ;
        }
        int one = costs[0]+get(days,i+1,costs) ; 
        int j = i ; 
        while(j<days.length&&days[j]<days[i]+7){
            j++ ;
        }
        int two = costs[1]+get(days,j,costs) ;
        j = i ; 
        while(j<days.length&&days[j]<days[i]+30){
            j++ ;
        }
        int three = costs[2]+get(days,j,costs) ;
        return dp[i] =  Math.min(one,Math.min(two,three));
    }
    
    
}