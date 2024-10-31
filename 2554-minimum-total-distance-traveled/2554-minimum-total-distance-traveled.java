class Solution {
    long [][] dp ;
    public long get(List<Integer> robot, int[] factory, int r, int f) {
        if (r < 0) {
            return 0;
        }
        if (f < 0) {
            return Long.MAX_VALUE/10;
        }
        if(dp[r][f]!=-1){
            return dp[r][f] ;
        }
        long choose = Math.abs(robot.get(r) - factory[f]) + get(robot, factory, r - 1, f - 1);
        long noChoose = get(robot, factory, r, f - 1);
        dp[r][f] = Math.min(choose, noChoose);
        return dp[r][f] ;
    }

    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        int n = 0 ; 
        for(int i = 0 ; i<factory.length;i++){
            n = n+factory[i][1]  ;
        }
        dp = new long[robot.size()][n] ;
        for(int i = 0 ; i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> Integer.compare(a[0], b[0]));

        int [] fact = new int[n];
        int x = 0  ;
        for (int[] f : factory) {
            for (int j = 0; j < f[1]; j++) {
                fact[x++] = (f[0]);
            }
        }

        return get(robot, fact, robot.size() - 1, fact.length - 1);
    }
}
