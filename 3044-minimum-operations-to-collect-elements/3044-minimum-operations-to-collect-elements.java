class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int x = 0 ; 
        int z = nums.size() - 1 ; 
        int count = 0 ;
        int a[] = new int[k + 1] ;
        System.out.println(Arrays.toString(a)) ;
        while (z >= 0) {
            if (x == k) {
                return count ;
            }
            try {
                if (a[nums.get(z--)] == 0) {
                    a[nums.get(z+1)] = 1 ;
                    x++ ;
               }
            } catch (Exception e) {
              
            }
            count++ ;
        }
        return count ;
    }
}
