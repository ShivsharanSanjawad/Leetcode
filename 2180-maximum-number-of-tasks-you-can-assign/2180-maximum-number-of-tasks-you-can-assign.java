class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks) ; 
        Arrays.sort(workers) ; 
        int s = 0 ; 
        int e = tasks.length ; 
        int ans = 0;
        while(e>=s){
            int mid = s + (e-s)/2 ; 
            if(get(tasks,workers,mid,pills,strength)){
                ans = mid ;
                s = mid + 1;
            }else e = mid -1 ;
        }
        return ans;
    }

    public boolean get(int []t,int []w, int mid , int p, int st){
        TreeMap<Integer,Integer> ts = new TreeMap<>() ; 
        for(int i=w.length-mid;i<w.length;i++){
            if(i<0){
                continue ;
            }
            ts.put(w[i],ts.getOrDefault(w[i],0)+1) ;
        }
        for(int i=mid-1;i>=0;i--){
            Integer x = ts.ceilingKey(t[i]) ; 
            if(x!=null){
                ts.put(x,ts.get(x)-1) ; 
                if(ts.get(x)==0){
                    ts.remove(x) ;
                }
            }else{
                if(p==0){
                    return false ;
                }
                x = ts.ceilingKey(t[i]-st);
                if(x==null){
                    return false ;
                }
                p-- ; 
                ts.put(x,ts.get(x)-1) ; 
                if(ts.get(x)==0){
                    ts.remove(x) ;
                }
            }
        }
        return true;
    }
}