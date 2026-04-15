// 2515. Shortest Distance to Target String in a Circular Array

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDist = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(words[i].equals(target)){
                int diff = Math.abs(i - startIndex);
                int min = Math.min(n - diff, diff);
                minDist = Math.min(min, minDist);
            }
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}