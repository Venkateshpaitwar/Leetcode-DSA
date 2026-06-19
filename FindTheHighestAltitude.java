//1732. Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int sum = 0;
        for(int i = 0; i < gain.length; i++){
            sum += gain[i];
            highestAltitude = Math.max(highestAltitude, sum);
        }
        return highestAltitude;
    }
}