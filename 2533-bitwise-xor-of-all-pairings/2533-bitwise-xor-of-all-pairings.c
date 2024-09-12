int xorAllNums(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int xor = 0 ; 
    if(nums1Size&1){
        for(int i = 0 ; i<nums2Size;i++){
            xor = xor^nums2[i] ; 
        }
    }
    if(nums2Size&1){
        for(int i = 0 ; i<nums1Size;i++){
            xor = xor^nums1[i] ; 
        }
    }
    return xor ;
}