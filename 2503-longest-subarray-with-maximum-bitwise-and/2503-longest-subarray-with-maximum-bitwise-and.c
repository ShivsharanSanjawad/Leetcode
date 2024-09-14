int longestSubarray(int* nums, int numsSize) {
    int prev = nums[0]; 
    int max = 0; 
    int length = 0; 

    for (int i = 0; i < numsSize; i++) {
        if (nums[i] > prev) {
            prev = nums[i];
            length = 1;
            max = 1;
        } else if (nums[i] == prev) {
            length++;
            max = (max > length) ? max : length;
        } else {
            length = 0;
        }
    }

    return max;
}
