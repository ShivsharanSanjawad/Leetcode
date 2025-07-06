class FindSumPairs {
    HashMap<Integer,Integer> x ;
    int []  nums1 ;
    int [] nums2;
    public FindSumPairs(int[] nums1, int[] nums2) {
        x = new HashMap<>() ; 
        this.nums1 = nums1 ;
        this.nums2 = nums2 ;
        for(int i=0;i<nums2.length;i++){
            x.put(nums2[i],x.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
        int y = nums2[index] ; 
        x.put(nums2[index],x.get(nums2[index])-1);
        nums2[index] +=val ;
        x.put(nums2[index],x.getOrDefault(nums2[index],0)+1);
    }
    
    public int count(int tot) {
        int count = 0 ; 
        for(int i=0;i<nums1.length;i++){
            int z = tot - nums1[i] ;
            count += x.getOrDefault(z,0);
        }
        return count ;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */