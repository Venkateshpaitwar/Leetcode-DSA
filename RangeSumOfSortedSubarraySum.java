// 1508. Range Sum of Sorted Subarray Sums

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        long ans = 0;
        int MOD = 1_000_000_007;

        for (int i = left - 1; i < right; i++) {
            ans = (ans + list.get(i)) % MOD;
        }

        return (int) ans;
    }
}