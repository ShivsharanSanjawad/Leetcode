/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* divisibilityArray(char * word, int m, int* returnSize){
    int size = strlen(word) ;
    int *a = (int*)malloc(sizeof(int)*size) ;
    *returnSize = size;
    long l = 0 ;
    for(int i = 0 ; i<size ; i++){
            l = ((10*l)+word[i]-'0')%m ; 
            if(l==0){
                a[i] = 1; 
            }else{
                a[i]=0 ;
            }
    }
    return a; 
                 
}