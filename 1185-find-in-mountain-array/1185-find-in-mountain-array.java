/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int x = get(mountainArr) ;
       
        int y = search(mountainArr, 0,x,target) ;
        if(y!=-1){
           return y;
        }
        return searh(mountainArr,x+1,mountainArr.length()-1,target) ;
    }
    public int search(MountainArray mountainArr,int s  , int e,int target){
        while(e>=s){
            int mid =  s + (e-s)/2 ; 
            int x  = mountainArr.get(mid) ; 
            if(x==target){
                return mid ; 
            }else if (x>target){
                e = mid- 1;
            }else {
                s = mid + 1 ;
            }
        }
        return -1 ;
        
    }
    public int searh(MountainArray mountainArr,int s  , int e,int target){
        while(e>=s){
            int mid =  s + (e-s)/2 ; 
            int x  = mountainArr.get(mid) ; 
            if(x==target){
                return mid ; 
            }else if (x<target){
                e = mid- 1;
            }else {
                s = mid + 1 ;
            }
        }
        return -1 ;
        
    }
    
     public int get(MountainArray mountainArr) {
        int s  = 0 ; 
        int e = mountainArr.length() -1 ; 
        while(e>s){
            int mid = s + (e-s)/2 ; 
            int x = mountainArr.get(mid) ; 
            int y = mountainArr.get(mid+1) ;
            if(x>=y){
                e = mid;
            }else{
                if(x<=y){
                    s = mid+1 ;
                }
            }
            
        }
        return s ;
    }
}