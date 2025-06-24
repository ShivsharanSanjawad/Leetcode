class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
      ArrayList<Integer> x = new ArrayList<>() ; 
      for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                x.add(i) ;
            }
      }  
      int a[] = new int[x.size()] ;
      for(int i=0;i<x.size();i++){
        a[i] = x.get(i) ;
      }
      ArrayList<Integer> ans = new ArrayList<>() ;
      for(int i=0;i<nums.length;i++){
            int y = Arrays.binarySearch(a,i);
            if(y>=0){
                ans.add(i) ;
            }else{
                y = -(y+1); 
                if((y<a.length&&(a[y]-i<=k))||(y>0&&i-a[y-1]<=k)){
                    ans.add(i);
                }
            }
      }
      return ans ;
    }
}