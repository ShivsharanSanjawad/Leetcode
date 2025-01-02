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
    HashMap<TreeNode,Integer> dp ;
    public int rob(TreeNode root) {
        dp = new HashMap<>();
       return get(root); 
    }
    public int get(TreeNode root){
        if(root==null){
            return 0 ;
        }
        if(dp.containsKey(root)){
            return dp.get(root);
        }
        int one = root.val ;
        if(root.left!=null){
            one +=get(root.left.right) + get(root.left.left);
        }
        if(root.right!=null){
            one +=get(root.right.left)+get(root.right.right);
        }
        int two =get(root.left) + get(root.right);
        int x =Math.max(one,two);
        dp.put(root,x);
        return x;
    }
}