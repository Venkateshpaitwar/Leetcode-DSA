//3043. Find the Length of the Longest Common Prefix

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> prefixes = new HashSet<>();
        for(int num : arr1){
            while(num > 0){
                prefixes.add(num);
                num /= 10;
            }
        }
        int ans = 0;
        for(int num : arr2){
            while(num > 0){
                if(prefixes.contains(num)){
                    ans = Math.max(ans, String.valueOf(num).length());
                    break;
                }
                num /= 10;
            }
        }
        return ans;
    }
}