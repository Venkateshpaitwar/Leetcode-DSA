// 3761. Minimum Absolute Distance Between Mirror Pairs

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int minDist = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int rev = reverse(nums[i]);
            
            if(map.containsKey(nums[i])){
                minDist = Math.min(i - map.get(nums[i]), minDist);
            }
            map.put(rev, i);
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
    private int reverse(int num){
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);
        long reversed = 0;
        while(num!= 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return (int) reversed * sign;
    }
}