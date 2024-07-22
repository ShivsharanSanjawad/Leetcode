import java.util.* ;
class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        People [] p = new People[names.length] ; 
        for(int i = 0 ; i<names.length ; i++){
            p[i] = new People(names[i],heights[i]) ;
        }
       Arrays.sort(p,Collections.reverseOrder()) ;
        for(int i= 0 ; i<names.length ; i++){
           names[i] =  p[i].name ;
        }
        return names ;
    }
}

class People implements Comparable<People>{
    People(String name ,int h){
        this.name = name ; 
        this.h = h ; 
    }
    String name ; 
    int h ; 

    public int compareTo(People o){
        return Integer.compare(this.h,o.h) ;
    }
}