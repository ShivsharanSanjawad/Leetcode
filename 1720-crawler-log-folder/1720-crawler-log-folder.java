class Solution {
    public int minOperations(String[] logs) {
        int ret = 0 ; 
        for(int i = 0 ; i<logs.length ;i++){
            if(logs[i].equals("../")){
                if(ret==0){

                }else if(true){
                        ret -- ; 
                }
               
            }else if(logs[i].equals("./")){

            }else{
                ret++ ; 
            }
        }
        if(ret<=0)
        return 0 ; 
        return ret ; 
    }
}