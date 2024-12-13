class Solution {
    public long findScore(int[] nums) {
        long score = 0 ; 
        boolean [] visited = new boolean[nums.length] ; 
        PriorityQueue<int[]> q= new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0] ;
            }
            return a[1] - b[1] ;
        })  ;
        Arrays.fill(visited,false);
        for(int i= 0 ; i<nums.length;i++){
            q.add(new int[]{nums[i],i});
        }
        int count = 0 ; 

        while(count!=2*nums.length&&!q.isEmpty()){
           int a[] =  q.poll() ;
        //    System.out.println(a[0]+" "+a[1]);
        //    System.out.println(visited[a[1]]);
                if(!visited[a[1]]){
                score +=a[0] ;
                count++ ;
                int x  = a[1] ; 
                if(x>0){
                    visited[x-1] = true ;
                    count++ ;
                }
                if(x<nums.length-1){
                    visited[x+1] = true;
                    count++ ;
                }
                visited[a[1]] = true ;
            }
        }
        return score ;
    }
}