class Solution {
    public double averageWaitingTime(int[][] customers) {
        double sum = 0 ; 
        int curr = customers[0][0] ;
        for(int i = 0 ; i<customers.length ; i++){
                if(customers[i][0]>curr){
                    curr = customers[i][0] ;
                }
                sum = sum + (curr+customers[i][1])-customers[i][0] ; 
                System.out.println(sum+" for "+i) ;
                curr = curr + customers[i][1] ;
                    System.out.println(curr+" for "+i) ;
        }
        return sum/customers.length ;
    }
}