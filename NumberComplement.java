// 476. Number Complement
class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder flip = new StringBuilder();
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '0'){
                flip.append('1');
            }else{
                flip.append('0');
            }
        }
        String ans = flip.toString(); 
        int flipped = Integer.parseInt(ans, 2);
        return flipped;
    }
}