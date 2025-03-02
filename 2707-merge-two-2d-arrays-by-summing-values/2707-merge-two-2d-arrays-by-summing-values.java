class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int [][] ans = new int[nums1.length+nums2.length][2] ; 
        int i=0 ; 
        int j=0 ;
        int x = 0 ;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i][0]>nums2[j][0]){
                ans[x++] = nums2[j++] ;
            }else if(nums1[i][0]<nums2[j][0]){
                ans[x++] = nums1[i++] ;
            }else {
                ans[x][0] = nums1[i][0] ; 
                ans[x][1] = nums1[i][1] + nums2[j][1] ;
                i++ ;
                j++ ; 
                x++ ; 
            }
        }
        while(i<nums1.length){
            ans[x++] = nums1[i++] ;
        }
        while(j<nums2.length){
            ans[x++] = nums2[j++] ;
        }
        return Arrays.copyOfRange(ans,0,x);
    }
}