import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp =arr.clone();  
        Arrays.sort(temp);  
        
        HashMap<Integer, Integer> rankMap = new HashMap<>();  
        int rank = 0;
        
        for (int i = 0; i < temp.length; i++) {
            if (!rankMap.containsKey(temp[i])) {
                rank++;
                rankMap.put(temp[i], rank);  
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);  
        }

        return result;
    }

}