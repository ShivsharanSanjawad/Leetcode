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
    ArrayList<ArrayList<Integer>> a ; 
    public void bfs(TreeNode root){
        Queue<TreeNode>q = new LinkedList<>() ; 
        q.add(root);
        int x = 0 ;
        while(!q.isEmpty()){
            a.add(new ArrayList<>());
            int get = q.size() ; 
            while(get>0){
            TreeNode temp = q.poll() ; 
            a.get(x).add(temp.val);
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
            get-- ;
            }
            x++ ;
        }
    }
    public void complete(TreeNode root){
        Queue<TreeNode>q = new LinkedList<>() ; 
        q.add(root);
        int x = 0 ;
        int i = a.get(x).size()-1 ;
        while(!q.isEmpty()){
            if(x!=a.size())
            i = a.get(x).size() -1 ; 
            int get = q.size() ; 
            while(get>0){
            TreeNode temp = q.poll() ; 
            if(x%2==1)
            temp.val = a.get(x).get(i--) ;
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
            get-- ;
            }
            x++ ;
        }

    }
    public TreeNode reverseOddLevels(TreeNode root) {
        a = new ArrayList<>() ;
        bfs(root);
        // for(int i = 0 ; i<a.size() ; i++){
        //     for(int j = 0 ; j<a.get(i).size() ; j++){
        //         System.out.print(a.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }
        complete(root);
        return root ;
    }
}