// 709.Lowercase

// we can directly use .toLowerCase();
// or (using ASCII values):
class Solution {
    public String toLowerCase(String s) {
        StringBuilder m = new StringBuilder(s.length());
        for(int i =0; i<s.length(); i++){
            char currChar = s.charAt(i);
            if(currChar >='A' && currChar<='Z'){
                char lowerCase = (char) (currChar + 32);
                m.append(lowerCase);
            }
            else{
                m.append(currChar);
            }
        }
        return m.toString();
    }
}