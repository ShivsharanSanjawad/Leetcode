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
            maxHeap.add((int)Math.ceil(x/3.0)) ;
            k-- ;
        }
        return score;
    }
}