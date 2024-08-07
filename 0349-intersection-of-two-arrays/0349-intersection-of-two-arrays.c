#include <stdio.h>
#include <stdlib.h>

// Function to merge two sorted arrays into one
int* merge(int* a, int size_a, int* b, int size_b, int* merged_size) {
    int* c = (int*)malloc((size_a + size_b) * sizeof(int));
    int i = 0, j = 0, x = 0;

    while (i < size_a && j < size_b) {
        if (a[i] < b[j]) {
            c[x++] = a[i++];
        } else {
            c[x++] = b[j++];
        }
    }

    while (i < size_a) {
        c[x++] = a[i++];
    }

    while (j < size_b) {
        c[x++] = b[j++];
    }

    *merged_size = size_a + size_b;
    return c;
}

// Function to compare two integers for qsort
int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}

// Function to find the intersection of two arrays
int* intersection(int* nums1, int size1, int* nums2, int size2, int* result_size) {
    qsort(nums1, size1, sizeof(int), compare);
    qsort(nums2, size2, sizeof(int), compare);

    int merged_size;
    int* merged = merge(nums1, size1, nums2, size2, &merged_size);

    int* temp = (int*)malloc(merged_size * sizeof(int));
    int temp_size = 0;
    int prev = INT_MIN;

    for (int i = 1; i < merged_size; i++) {
        if (merged[i] == merged[i - 1] && merged[i] != prev) {
            if (bsearch(&merged[i], nums1, size1, sizeof(int), compare) &&
                bsearch(&merged[i], nums2, size2, sizeof(int), compare)) {
                temp[temp_size++] = merged[i];
                prev = merged[i];
            }
        }
    }

    free(merged);

    int* result = (int*)malloc(temp_size * sizeof(int));
    for (int i = 0; i < temp_size; i++) {
        result[i] = temp[i];
    }

    free(temp);
    *result_size = temp_size;
    return result;
}

