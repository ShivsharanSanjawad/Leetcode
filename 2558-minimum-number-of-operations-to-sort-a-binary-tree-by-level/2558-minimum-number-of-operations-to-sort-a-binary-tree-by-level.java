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
class Pair {
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}

class Solution {
    ArrayList<ArrayList<Integer>> a ;
    public void bfs(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>() ; 
        q.add(root) ; 
        while(!q.isEmpty()){
         ArrayList<Integer>   y = new ArrayList<>() ; 
            int x = q.size() ; 
            while(x>0){
                TreeNode temp = q.poll() ; 
                y.add(temp.val); 
                if(temp.left!=null)
                q.add(temp.left) ; 
                if(temp.right!=null)
                q.add(temp.right);
                x-- ;
            }
            a.add(y) ; 
        }
    }
    public int get(List<Integer>a ){
        boolean [] visited = new boolean[a.size()] ;
        Pair []  arr = new Pair[visited.length] ; 
        for(int i = 0 ; i<a.size() ; i++){
            arr[i] = new Pair(a.get(i),i) ;
        } 
        Arrays.sort(arr,Comparator.comparingInt(Pair::getKey));
        int ans = 0 ; 
        for(int i= 0 ; i<arr.length ; i++){
            if(visited[i]==true||arr[i].getValue()==i){
                continue ;
            }
            int count = 0 ; 
            int j  = i ; 
            while(visited[j]==false){
                visited[j] = true ; 
                count++ ; 
                j = arr[j].getValue();
            }
            ans = ans + count -1 ; 
        }
        return ans ;
    }
    public int minimumOperations(TreeNode root) {
        a = new ArrayList<>() ; 
        bfs(root);
        int count = 0 ; 
        for(int i = 0 ;i<a.size() ;i++){
            count +=get(a.get(i));
        }
        return count ;
    }
}