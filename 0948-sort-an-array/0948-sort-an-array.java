class Solution {
    public int[] sortArray(int[] nums) {
         if(nums.length==1)
         return new int[]{nums[0]} ;
         int mid = nums.length/2 ; 
         int a[] = sortArray(Arrays.copyOfRange(nums,0,mid)) ; 
         int b[] = sortArray(Arrays.copyOfRange(nums,mid,nums.length)) ; 
        // System.gc() ;
         return merge(a,b) ;
    }

    public int[] merge(int a[],int b[]){
        int c[] = new int[a.length+b.length] ; 
        int i = 0 ; 
        int j = 0 ; 
        int x =0 ; 
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                c[x++]=a[i++] ;
            }else{
                c[x++] = b[j++] ;
            }
        }
        while(i<a.length){
            c[x++] =  a[i++] ;
        }
        while(j<b.length){
            c[x++] = b[j++] ;
        }
        return c ;
    }
}