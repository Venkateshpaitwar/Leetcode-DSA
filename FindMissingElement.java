// 3731. Find Missing Elements

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == min){
                min++;
            }else if(nums[i] != min && min < max){
                list.add(min);
                min++;
                i = i - 1;
            }
        }
        return list;
    }    
}