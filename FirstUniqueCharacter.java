// 387. First Unique Character in a String
class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();

        for(int i = 0; i < n; i++){
            boolean unique = true;
            for(int j = 0; j < n; j++){
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if(unique){
                return i;
            }
        }
        return -1;
    }
}



