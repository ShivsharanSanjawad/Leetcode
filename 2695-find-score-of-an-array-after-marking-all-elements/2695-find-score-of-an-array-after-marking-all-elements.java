class Solution {
    public long findScore(int[] nums) {
        long score = 0 ; 
        boolean [] visited = new boolean[nums.length] ; 
        PriorityQueue<int[]> q= new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]) ;
            }
            return Integer.compare(a[1],b[1]) ;
        })  ;
        Arrays.fill(visited,false);
        for(int i= 0 ; i<nums.length;i++){
            q.add(new int[]{nums[i],i});
        }

        while(!q.isEmpty()){
           int a[] =  q.poll() ;
        //    System.out.println(a[0]+" "+a[1]);
        //    System.out.println(visited[a[1]]);
                if(!visited[a[1]]){
                score +=a[0] ;
                int x  = a[1] ; 
                if(x>0){
                    visited[x-1] = true ;
                }
                if(x<nums.length-1){
                    visited[x+1] = true;
                }
                visited[a[1]] = true ;
            }
        }
        return score ;
    }
}