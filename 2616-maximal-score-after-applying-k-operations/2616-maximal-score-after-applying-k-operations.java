class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for(int i = 0 ; i<nums.length ;i++){
            maxHeap.add(nums[i]) ; 
        }
        long score = 0 ;
        while(k>0){
            int x = maxHeap.poll() ; 
            score +=x ;
           // System.out.println(x);
          // System.out.println(Math.ceil(x/3));
            maxHeap.add((int)Math.ceil(x/3.0)) ;
            k-- ;
        }
        return score;
    }
}