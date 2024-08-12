bool doesValidArrayExist(int* derived, int derivedSize){
        int x = 0 ; 
        for(int i = 0 ; i<derivedSize ; i++){
            x = x^derived[i] ;
        }
        return x==0 ;
}