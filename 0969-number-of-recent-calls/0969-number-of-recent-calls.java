class RecentCounter {
    ArrayList<Integer> ans  ;
    public RecentCounter() {
        ans = new ArrayList<>() ; 
    }
    
    public int ping(int t) {
        if(ans.size()==0){
            ans.add(t) ;
            return 1 ; 
        }
        ans.add(t) ; 
        int i   = 0 ; 
        int j = ans.size() ; 
        while(ans.size()>0){
            if(t-ans.get(0)<=3000){
                return ans.size() ; 
            }
            i++ ;
            ans.remove(0) ;
        }
        return  j-i ;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */