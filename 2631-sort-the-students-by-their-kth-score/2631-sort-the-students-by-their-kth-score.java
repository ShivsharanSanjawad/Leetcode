class Solution {
    public int[][] sortTheStudents(int[][] scores, int k) {
       Arrays.sort(scores , new Comparator<int[]>(){
        public int compare(int a[] , int b[]){
            return b[k]-a[k];
        }
       }) ;
       return scores ;
    }
}