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
    public int get(TreeNode root , int max){
        if(root==null){
            return 0 ;
        }
        if(root.val<max){
            return get(root.left , max)+ get(root.right,max) ;
        }
        return 1+get(root.left,root.val)+get(root.right,root.val) ; 
    }
    public int goodNodes(TreeNode root) {
        return get(root , Integer.MIN_VALUE) ;
    }
}