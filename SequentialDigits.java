// 1291. Sequential Digits

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list  = new ArrayList<>();
        for(int i = 1; i < 10; i++){
            int num = i;
            for(int j = i + 1; j < 10; j++){
                num = num * 10 + j;
                if(num <= high && num >= low){
                    list.add(num);
                }
            }
        } 
        Collections.sort(list);
        return list;
    }
}