/**
 * @param {number[]} nums
 * @return {boolean}
 */
var divideArray = function(nums) {
    let xor = 0 ; 
    for(let i =0 ;i<nums.length;i++){
        xor ^=1<<nums[i] ;
    }
    return xor==0 ;
};