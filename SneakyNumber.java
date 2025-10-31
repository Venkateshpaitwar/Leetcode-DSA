class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        int[] result = new int[n];
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    result[count++] = nums[i]; 
                    break;
                }
            }
        }
    int[] sneaky = new int[count];
    for (int i = 0; i < count; i++) {
        sneaky[i] = result[i];
    }
    return sneaky;
    }
}