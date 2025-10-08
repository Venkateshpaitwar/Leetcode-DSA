import java.util.*;

public class SPOSP {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m = spells.length;
        int[] result = new int[m];

        for(int i=0; i< m; i++){
            long target = success / spells[i];
            if(success % spells[i] != 0){
                target++;
            }
            result[i] = binarySearch(potions,target);
        }
        return result;  
    }
    private int binarySearch(int[] potions,long target){
        int left = 0;
        int right = potions.length;
        while(left<right){
            int mid = left + (right-left) /2;
            if(potions[mid] >= target){
                right = mid; 
            }
            else{
                left = mid+1;
            }
        }
    return potions.length - left;
    }
       public static void main(String[] args) {
        SPOSP V = new SPOSP();
        int[] spells = {5,1,3};
        int[] potions = {1, 2, 3, 4, 5};
        long success = 7;
        
        int[] result = V.successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(result));  // Output the results
    }

}