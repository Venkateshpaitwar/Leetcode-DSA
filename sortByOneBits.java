// 1356. Sort Integers by The Number of 1 Bits

import java.util.*;
class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer>[] buckets = new ArrayList[15];

        for (int i = 0; i < 15; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : arr) {
            buckets[Integer.bitCount(num)].add(num);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket) {
                arr[index++] = num;
            }
        }

        return arr;
    }
}