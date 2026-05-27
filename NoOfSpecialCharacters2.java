// 3121. Count the Number of Special Characters II

class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for(char c = 'a'; c <= 'z'; c++){
            int lower = word.lastIndexOf(c);    //stores the last occurence
            int upper = word.indexOf(Character.toUpperCase(c));
            if(lower != -1 && upper != -1 && lower < upper){
                count++;
            }
        }
        return count;
    }
}