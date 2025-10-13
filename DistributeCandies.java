import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> distinctCandies = new HashSet<>();
        
        for (int candy : candyType) {
            distinctCandies.add(candy);
        }
        
        int maxDistinctCandies = candyType.length / 2;
        
        return Math.min(distinctCandies.size(), maxDistinctCandies);
    }
}