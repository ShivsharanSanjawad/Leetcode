class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> x = new HashMap<>(); 
        for(int i=0;i<arr.length;i++){
            x.put(arr[i],x.getOrDefault(arr[i],0)+1);
        }
        int max = -1 ; 
        for(Integer k:x.keySet()){
            if(x.get(k)==k){
                max = Math.max(max,k);
            }
        }
        return max;
    }
}