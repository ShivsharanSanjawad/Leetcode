class Solution {
    public int countServers(int[][] grid) {
        long row[] = new long[grid.length];
        long column[] = new long[grid[0].length] ;
        for(int i = 0 ; i<grid.length;i++){
            long sum = 0 ; 
            for(int j = 0 ;j<grid[0].length;j++){
                sum +=grid[i][j] ;
            }
            row[i] = sum ;
        }
        for(int i=0 ;i<grid[0].length;i++){
            long sum = 0 ; 
            for(int j= 0 ; j<grid.length;j++){
                sum +=grid[j][i] ;
            }
            column[i] = sum ;
        }
        long count = 0 ; 
        for(int i = 0 ; i<grid.length;i++){
            for(int j =0 ; j<grid[0].length;j++){
                if(grid[i][j]==1&&(row[i]>1||column[j]>1)) {
                    count++;
                }
            }
        }
        return (int)count ;
    }
}