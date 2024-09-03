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
    List<Integer>ans ;
    public void gdo(){
        if(ans==null){
            ans = new ArrayList<>() ; 
        }
    }
    public List<Integer> get(TreeNode root){
         if(root==null){
            return ans ;
        }
       get(root.left) ; 
       get(root.right) ;
        ans.add(root.val) ; 
        return ans ;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        gdo()  ; 
        return get(root) ;
    }
}