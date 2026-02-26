//1404. Number of Steps to Reduce a Number in Binary Representation to One

class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        for(int i = s.length()-1; i > 0; i--){
            int bit = (s.charAt(i) - '0') + carry;
            if(bit % 2 == 0){
                steps += 1;
            }
            else{
                steps += 2;
                carry = 1;
            }
        }
        if(carry == 1){
            steps++;
        }
        return steps;
    }
}