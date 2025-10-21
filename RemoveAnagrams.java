import java.util.*;
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        String prevSorted  = "";

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!sortedWord.equals(prevSorted)) {
                result.add(word);
                prevSorted = sortedWord;
            }
        }
        return result;
    }
}