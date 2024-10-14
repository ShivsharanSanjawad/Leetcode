class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<nums.length ;i++){
            maxHeap.add((long)nums[i]) ; 
        }
        long score = 0 ;
        while(k>0){
            long x = maxHeap.poll() ; 
            score +=x ;
           // System.out.println(x);
          // System.out.println(Math.ceil(x/3));
            maxHeap.add((long)Math.ceil(x/3.0)) ;
            k-- ;
        }
        return score;
    }
}