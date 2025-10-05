import java.util.Arrays;
    public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int size = nums.length;
            for(int i=0;i<size;i++){
                for(int j = i+1;j<size;j++)
                    if (nums[i]+ nums[j] == target){
                    return new int[] {i, j};
                }
            }
        return new int[] {-1, -1};    
        }
        public static void main(String[] args) {
            int[] nums = {2, 7, 11, 15};
            int target = 9;

            TwoSum ts = new TwoSum();  // Create an object of TwoSum
            int[] result = ts.twoSum(nums, target);  // Call the instance method
            System.out.println("int array = " + Arrays.toString(result));  // Print array correctly
    }
}
