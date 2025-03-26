class Solution {
    public int minOperations(int[][] grid, int x) {
        int a[] = new int[grid.length*grid[0].length] ; 
        int y = 0 ;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                a[y++] = grid[i][j] ; 
            }
        }  
        Arrays.sort(a) ; 
        int total = grid.length*grid[0].length ;
        int mid = (int)Math.ceil(total/2.0) ;
        if(total==1){
            return 0;
        }
       // System.out.println(Arrays.toString(a)+" "+mid) ;
        int ans = 0 ; 
        for(int i=0;i<a.length;i++){
            int z =  Math.abs(a[i]-a[mid-1]) ;
            if(z%x!=0){
                return -1 ;
            }
            ans += z/x ; 
        }
        return ans ;
    }
}