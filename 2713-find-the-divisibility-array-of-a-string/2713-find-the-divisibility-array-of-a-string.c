/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* divisibilityArray(char * word, int m, int* returnSize){
    int i ;
    for(i = 0 ; word[i]!=0;i++){

    }
    int *a = (int*)malloc(sizeof(int)*i) ;
    *returnSize = i ;
    long l = 0 ;
    for(i = 0 ; word[i]!=0 ; i++){
            l = ((10*l)+word[i]-'0')%m ; 
            if(l==0){
                a[i] = 1; 
            }else{
                a[i]=0 ;
            }
    }
    return a; 
                 
}