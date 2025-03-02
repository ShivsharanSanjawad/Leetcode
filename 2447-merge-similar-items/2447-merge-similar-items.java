class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] nums1, int[][] nums2) {
        Arrays.sort(nums1,(x,y)->Integer.compare(x[0],y[0]));
        Arrays.sort(nums2,(x,y)->Integer.compare(x[0],y[0]));
        List<List<Integer>> a = new ArrayList<>() ;
        int i=0 ; 
        int j=0 ;
        while(i<nums1.length&&j<nums2.length){
            ArrayList<Integer> temp = new ArrayList<>() ;
            if(nums1[i][0]>nums2[j][0]){
               temp.add(nums2[j][0]) ;
               temp.add(nums2[j][1]) ;
               j++ ;
            }else if(nums1[i][0]<nums2[j][0]){
                temp.add(nums1[i][0]) ;
                temp.add(nums1[i][1]) ; 
                i++;
            }else {
                temp.add(nums1[i][0]) ; 
                temp.add(nums1[i][1] + nums2[j][1]) ;
                i++ ;
                j++ ; 
            }
            a.add(temp);
        }
        while(i<nums1.length){
            ArrayList<Integer> temp = new ArrayList<>() ;
            temp.add(nums1[i][0]) ;
            temp.add(nums1[i][1]) ; 
            i++;
            a.add(temp);
        }
        while(j<nums2.length){
            ArrayList<Integer> temp = new ArrayList<>() ;
            temp.add(nums2[j][0]) ;
            temp.add(nums2[j][1]) ;
            j++ ;
            a.add(temp);
        }
        return a;
    }
}