


typedef struct {
    int *nums ;
    int size ;
} Solution;


Solution* solutionCreate(int* nums, int numsSize) {       
         Solution *p = (Solution*)malloc(sizeof(Solution)); 
           p->nums = nums ; 
           p->size = numsSize ; 
           return p ;
}

int solutionPick(Solution* obj, int target) {

     int curr = *(obj->nums) -1 ; 
        int count = 1;
        for(int i  = 0 ; i<obj->size ; i++){
            if(obj->nums[i]==target){
                  if(rand()%(count++)==0){
                    curr = i  ;
                  }
            }
        }
        return curr ;
 
}

void solutionFree(Solution* obj) {
    free(obj) ;
}

/**
 * Your Solution struct will be instantiated and called as such:
 * Solution* obj = solutionCreate(nums, numsSize);
 * int param_1 = solutionPick(obj, target);
 
 * solutionFree(obj);
*/