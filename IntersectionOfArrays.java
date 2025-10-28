import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int ele : nums1){
            set1.add(ele);  
        }
        Set<Integer> IntersectionSet = new HashSet<>();
        for(int ele : nums2){
            if(set1.contains(ele)){
                IntersectionSet.add(ele);
            }
        }
        int[] result = new int[IntersectionSet.size()];
        int i = 0;
        for (int ele : IntersectionSet) {
            result[i++] = ele;
        }
        return result;
    }
}