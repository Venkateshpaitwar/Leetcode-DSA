// 1094. Car Pooling

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] changes = new int[1001];

        for (int[] trip : trips) {
            int passengers = trip[0];
            int from = trip[1];
            int to = trip[2];
            changes[from] += passengers;
            changes[to] -= passengers;
        }
        int passengers = 0;
        for (int i = 0; i <= 1000; i++) {
            passengers += changes[i];
            if (passengers > capacity) {
                return false;
            }
        }
        return true;
    }
}