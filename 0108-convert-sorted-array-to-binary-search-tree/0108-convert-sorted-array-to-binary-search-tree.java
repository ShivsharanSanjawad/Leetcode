/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return get(nums,0,nums.length-1);
    }
    public TreeNode get(int[]nums,int s , int e){
        if(s>e){
            return null;
        }
        int mid = s+ (e-s)/2 ; 
        TreeNode ans = new TreeNode(nums[mid]);
        ans.left = get(nums,s,mid-1) ;
        ans.right = get(nums,mid+1,e);
        return ans ;
    }
}