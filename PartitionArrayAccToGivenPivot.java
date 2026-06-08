// 2161. Partition Array According to Given Pivot

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num < pivot) {
                list.add(num);
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                list.add(num);
            }
        }
        for (int num : nums) {
            if (num > pivot) {
                list.add(num);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
   