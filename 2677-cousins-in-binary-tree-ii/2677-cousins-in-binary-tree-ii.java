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
    ArrayList<Integer> a  ;
    public void get(TreeNode root){
        Queue<TreeNode> q = new ArrayDeque<>() ;
        q.add(root) ;
        while(!q.isEmpty()){
            int sum = 0 ;
            int k = q.size() ;
            for(int i = 0 ; i<k;i++){
                TreeNode temp = q.poll();
                sum +=temp.val;
                if(temp.left!=null){
                q.add(temp.left);
                }
                if(temp.right!=null){
                q.add(temp.right);
                }
            }
            a.add(sum);
        }
    }
public void perform(TreeNode root){
    Queue<TreeNode> q = new ArrayDeque<>() ; 
    q.add(root);
    root.val = 0 ; 
    int level = 0 ; 
    while(!q.isEmpty()) {
        int k = q.size() ; 
        for(int i = 0 ; i<k ; i++){
            TreeNode temp = q.poll() ;
            int sum = 0 ;
            if(temp.left!=null)
                sum+=temp.left.val;  
            if(temp.right!=null){
                sum+=temp.right.val;
                q.add(temp.right);
            }
            if(temp.left!=null){
                temp.left.val = a.get(level+1)-sum ; 
                q.add(temp.left);
            }
            if(temp.right!=null){
                temp.right.val = a.get(level+1) - sum ; 
            }
        }
        level++ ;
    }
    }
    public TreeNode replaceValueInTree(TreeNode root) {
            a = new ArrayList<>() ; 
            get(root);
            perform(root);
            System.out.println(a);
            return root;
    }
}