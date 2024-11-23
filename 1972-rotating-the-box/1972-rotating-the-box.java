class Solution {
    public char[][] rotateTheBox(char[][] box) {
        for(int i = 0 ; i<box.length; i++){
            for(int j  = box[i].length-1 ; j>=0 ; ){
                 if(box[i][j]=='.'){
                    int k = j; 
                    while(k>=0){
                        if(box[i][k]=='#'){
                            box[i][j] = '#' ; 
                            box[i][k]='.' ; 
                            break ;

                        }
                        if(box[i][k]=='*'){
                            j = k;
                            break ;
                        }
                        k-- ;
                    }
                 }
                 j-- ;
                 
               }
            }
        // for(int i = 0 ; i<box.length ;i++){
        //     for(int j = 0 ; j<box[0].length ;j++){
        //         System.out.print(box[i][j]+" ") ;
        //     }
        //     System.out.println() ;
        // }
        int m = box.length ;
        char ch [][] = new char[box[0].length][box.length];
        for(int i = 0 ; i<ch.length ;i++){
            for(int j = 0 ; j<ch[i].length;j++){
                ch[i][j] = box[m-1-j][i] ;
            }
        }
        return ch;
    }
}