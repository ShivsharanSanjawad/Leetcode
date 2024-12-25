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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> a = new ArrayList<>() ; 
        Queue<TreeNode> q = new LinkedList<>() ; 
        q.add(root); 
        while(!q.isEmpty()){
            int x = q.size() ; 
            int max = Integer.MIN_VALUE ; 
            while(x>0){
                TreeNode temp = q.poll() ; 
                if(temp.val>max){
                    max = temp.val ;
                }
                if(temp.left!=null)
                q.add(temp.left) ;
                if(temp.right!=null) 
                q.add(temp.right);
                 x--;
            }
            a.add(max);
        }
        return a ;
    }
}