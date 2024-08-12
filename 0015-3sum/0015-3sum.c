#include <stdlib.h>
#include <stdio.h>

long MAX_TRIPLETS ;

int** ans;
int z;

void heapify(int* arr, int n, int i) {
    int largest = i;       // Initialize largest as root
    int left = 2 * i + 1;  // left = 2*i + 1
    int right = 2 * i + 2; // right = 2*i + 2

    // Check if left child is larger than root
    if (left < n && arr[left] > arr[largest])
        largest = left;

    // Check if right child is larger than largest so far
    if (right < n && arr[right] > arr[largest])
        largest = right;

    // Swap and continue heapifying if root is not largest
    if (largest != i) {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;

        // Recursively heapify the affected subtree
        heapify(arr, n, largest);
    }
}

// Function to perform heap sort
void heapSort(int* arr, int n) {
    // Build a max heap
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);

    // Extract elements one by one from heap
    for (int i = n - 1; i > 0; i--) {
        // Move current root to end
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        // Call heapify on the reduced heap
        heapify(arr, i, 0);
    }
}
void twosum(int* nums, int size, int sum, int x) {
    int e = size - 1;
    while (x < e) {
        int temp = nums[x] + nums[e];
        if (sum == temp) {
            if (z >= MAX_TRIPLETS) {
                // Optional: Resize ans if necessary
                 ans = (int**)realloc(ans, sizeof(int*) * ( 20000));
            }
            int* add = (int*)malloc(sizeof(int) * 3);
            if (add == NULL) return;  // Check for allocation failure
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
    if (ans == NULL) return NULL;  // Check for allocation failure

    heapSort(nums,numsSize);

    for (int i = 0; i < numsSize - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        twosum(nums, numsSize, -nums[i], i + 1);
    }

    *returnSize = z;
    *returnColumnSizes = (int*)malloc(sizeof(int) * z);
    if (*returnColumnSizes == NULL) return NULL;  // Check for allocation failure
    for (int i = 0; i < z; i++) {
        (*returnColumnSizes)[i] = 3;
    }

    return ans;
}

