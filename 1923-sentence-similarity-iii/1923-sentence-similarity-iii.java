class Solution {
    public boolean checkMiddle(String [] x, String y[]){
            int s1 = 0 ; 
            int e1 = x.length -1 ; 
            int s2 = 0 ; 
            int e2 = y.length -1 ; 
             boolean flag = true ;
            while(s2<=e2){
               
                if(!x[s1].equals(y[s2])){
                    flag = false ;
                    break ;
                }
                s1++ ; 
                s2 ++ ;
                if(!x[e1].equals(y[e2])){
                   break ;
                }
                e1-- ; 
                e2 -- ; 
            }
            if(!flag){
                while(s2<=e2){
                     if(!x[e1].equals(y[e2])){
                   return false ;
                }
                e1-- ; 
                e2 -- ; 
                }
            }else{
                while(s2<=e2){
                if(!x[s1].equals(y[s2])){
                   return false ;
                }
                s1++ ; 
                s2 ++ ;
                }
            }

            return true ;
    }
    public boolean checkStart(String[]x , String y[]){
       System.out.println( Arrays.toString(x)) ; 
   System.out.println( Arrays.toString(y)) ;
      int e1 = x.length-1 ; 
        int e2 = y.length -1 ; 
        while(e2>=0){
            if(!x[e1].equals(y[e2])){
                return false ;
            }
            e1-- ; 
            e2-- ;
        }
        return true ;
    }
    public boolean checkEnd(String x[] , String y[]){
         System.out.println( Arrays.toString(x)) ; 
   System.out.println( Arrays.toString(y)) ;
            int s1 = 0 ; 
            int s2 = 0 ; 
            int e2 = y.length;
            while(s2<e2){
                if(!x[s1].equals(y[s2])){
                    return false ;
                }
                s1++ ; 
                s2++ ;
            }
            return true ;
    }
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.equals(sentence2)){
            return true ; 
        }
        if(sentence1.length()==sentence2.length()){
            return false ;
        }
        String [] x = sentence1.split(" ") ; 
        String  [] y = sentence2.split(" ") ; 
        if(x.length<y.length){
            String [] temp = x ; 
            x = y ; 
            y = temp ;
        }
         if(x[0].equals(y[0])){
            if(x[x.length-1].equals(y[y.length-1])){
                return checkMiddle(x , y ) ;
             }
             return checkEnd(x,y) ;
         }
        if(x[x.length-1].equals(y[y.length-1])){
            return checkStart(x,y) ;
        }
        return false ;
    }
}