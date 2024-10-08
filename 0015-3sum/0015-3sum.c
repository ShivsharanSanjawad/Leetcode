#include <stdlib.h>
#include <stdio.h>

long MAX_TRIPLETS ;

int** ans;
int z;

void bubbleSort(int* nums, int size) {
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }
}

void twosum(int* nums, int size, int sum, int x) {
    int e = size - 1;
    while (x < e) {
        int temp = nums[x] + nums[e];
        if (sum == temp) {
            if (z >= MAX_TRIPLETS) {
                 ans = (int**)realloc(ans, sizeof(int*) * ( 20000));
            }
            int* add = (int*)malloc(sizeof(int) * 3);
            if (add == NULL) return;  
            add[0] = nums[x];
            add[1] = nums[e];
            add[2] = -sum;
            ans[z++] = add;

            while (x < e && nums[x] == nums[x + 1]) x++;
            while (x < e && nums[e] == nums[e - 1]) e--;

            x++;
            e--;
        } else if (temp < sum) {
            x++;
        } else {
            e--;
        }
    }
}

int** threeSum(int* nums, int numsSize, int* returnSize, int** returnColumnSizes) {
    z = 0;
    long n = numsSize ;
    MAX_TRIPLETS = n*(n-1)*(n-2)/6;
    if(MAX_TRIPLETS>20000){
        MAX_TRIPLETS = 20000 ;
    }
    ans = (int**)malloc(sizeof(int*) * MAX_TRIPLETS);
    

    bubbleSort(nums, numsSize);

    for (int i = 0; i < numsSize - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        twosum(nums, numsSize, -nums[i], i + 1);
    }

    *returnSize = z;
    *returnColumnSizes = (int*)malloc(sizeof(int) * z);

    for (int i = 0; i < z; i++) {
        (*returnColumnSizes)[i] = 3;
    }

    return ans;
}

