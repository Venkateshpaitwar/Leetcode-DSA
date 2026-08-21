// 3432. Count Partitions with Even Sum Difference

class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        return totalSum % 2 == 0 ? nums.length - 1 : 0;
    }
}