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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>() ; 
        ArrayList<Long> a = new ArrayList<>() ;
        q.add(root) ;
        while(!q.isEmpty()){
            int levelsize = q.size() ; 
            long sum = 0 ; 
            for(int i =0 ; i<levelsize ; i++){
                TreeNode temp = q.poll(); 
                sum +=temp.val ; 
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            a.add(sum);
        }
        Collections.sort(a);
       if(a.size()<k){
        return -1;
       }
        return a.get(a.size()-k);
    }
}