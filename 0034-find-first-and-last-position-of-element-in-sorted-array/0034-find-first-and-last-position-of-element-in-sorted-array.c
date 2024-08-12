/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

   int get(int nums[] ,int n ,  int target , int start){
    int s =  0  ; 
    int e = n-1 ;
    int ans  = -1 ;
    while(e>=s){
        int mid = s +(e-s)/2 ; 
        if(nums[mid]>target){
            e = mid- 1 ;
        }else if (nums[mid]<target){
            s = mid + 1 ;
        }
        else if(nums[mid]==target){
            ans = mid ; 
            if(start){
                e = mid - 1; 
            }else{
                s = mid + 1 ;
            }

        }
    }
    return ans ; 
   }
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int * a = (int*)malloc(sizeof(int)*2)  ; 
    a[0] = get(nums,numsSize,target,1) ; 
    a[1] = get(nums,numsSize,target,0) ;
    *returnSize = 2 ;
    return a ;
}