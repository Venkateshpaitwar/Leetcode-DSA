// 3120. Count the Number of Special Characters I

class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for(char c = 'a'; c <= 'z'; c++){
            if(word.indexOf(c) != -1 && word.indexOf(Character.toUpperCase(c)) != -1){
                count++;
            }
        }
        return count;
    }
}