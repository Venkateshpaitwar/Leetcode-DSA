import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
        RomanToInteger ri = new RomanToInteger(); 
        System.out.println(ri.romanToInt(s));
    }
    public int romanToInt(String s) {
        HashMap<Character,Integer> RomanMap = new HashMap<>();
        RomanMap.put('I',1);
        RomanMap.put('V',5);
        RomanMap.put('X',10);
        RomanMap.put('L',50);
        RomanMap.put('C',100);
        RomanMap.put('D',500);
        RomanMap.put('M',1000);
        int total = 0;

        for(int i=0; i<s.length(); i++){
            if(i+1<s.length() && RomanMap.get(s.charAt(i)) < RomanMap.get(s.charAt(i+1))){
                total -= RomanMap.get(s.charAt(i));
            }else{
                total += RomanMap.get(s.charAt(i));

            }
        }
        return total;
    }
}