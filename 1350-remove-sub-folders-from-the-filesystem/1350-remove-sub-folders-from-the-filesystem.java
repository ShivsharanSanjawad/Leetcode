class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> x = new ArrayList<>() ; 
        String y = folder[0]+"/";
        x.add(folder[0]);
        for(int i =1  ; i<folder.length;i++){
            while(folder[i].startsWith(y)){
               i++ ;
               if(i==folder.length){
                return x ;
               }
            }
             x.add(folder[i]);
                y = folder[i]+"/" ;
        }
        return x;
    }
}