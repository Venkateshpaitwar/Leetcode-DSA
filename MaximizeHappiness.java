//3075. Maximize Happiness of selected Children

import java.util.Arrays;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        long sum = 0;
        long count = 0;   

        for (int i = happiness.length - 1; i >= 0 && k > 0; i--) {
            long current = (long) happiness[i] - count;

            if (current <= 0) break;

            sum += current;
            count++;
            k--;
        }
        return sum;
    }
}


