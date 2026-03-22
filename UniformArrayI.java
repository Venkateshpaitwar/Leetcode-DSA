// Construct Uniform Parity Array I
class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] nums2 = new int[n];
        int evenIndex = -1;
        int oddIndex = -1;
        for(int i = 0; i < n; i++){
            if(nums1[i] % 2 == 0 && evenIndex == -1){
                evenIndex = i;
            }
            if(nums1[i] % 2 != 0 && oddIndex == -1){
                oddIndex = i;
            }
        }
        for(int i = 0; i < n; i++){
            if(nums1[i] % 2 == 0){
                nums2[i] = nums1[i];
            }else{
                if(i != oddIndex){
                    nums2[i] = nums1[i] - nums1[oddIndex];
                }else{
                    for(int j = 0; j < n; j++){
                        if(j != i && nums1[j] % 2 != 0){
                            nums2[i] = nums1[i] - nums1[j];
                            break;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}