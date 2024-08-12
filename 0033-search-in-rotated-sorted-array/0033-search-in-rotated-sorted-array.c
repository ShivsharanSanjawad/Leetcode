int search(int* nums, int numsSize, int target) {
    
    
        if(numsSize<10){
            for(int i =0 ; i<numsSize; i++){
                if(nums[i]==target)
                return i ; 
            }
            return -1 ; 
        }
        return BinarySearch(nums , target, 0 , numsSize -1) ; 
    
}

   int BinarySearch(int a[] , int b , int l  , int h){
        int mid = l + (h-l)/2 ;
        if(a[mid]==b)
            return mid ;
            if(l>=h)
            return -1 ;
        
        if(a[mid]>a[l])
        {
            if(a[mid]>=b){
                if(a[l]<=b)
                  return   BinarySearch(a,b,l,mid) ;
            }
            return BinarySearch(a,b, mid+1 , h) ;

        }else if(a[mid]<a[h]){
            if(a[mid]<=b){
                if(a[h]>=b)
                    return BinarySearch(a,b,mid+1 , h) ;
            }
           
        }
        return BinarySearch(a, b, l , mid)  ;
    }
