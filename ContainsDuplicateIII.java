// 220. Contains Duplicate III

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            Long x = set.ceiling((long) nums[i] - valueDiff);
            if(x != null && x <= nums[i] + valueDiff){
                return true;
            }
            set.add((long) nums[i]);

            if(i >= indexDiff){
                set.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
}