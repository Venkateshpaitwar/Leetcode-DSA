import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> diffCandies = new HashSet<>();
        
        for (int candy : candyType) {
            diffCandies.add(candy);
        }
        
        int maxDistinctCandies = candyType.length / 2;
        
        return Math.min(diffCandies.size(), maxDistinctCandies);
    }
}