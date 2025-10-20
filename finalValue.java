class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int x = 0;
        for(int i =0; i<n; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++") ){
                x = x+1;
            }
            else{
                x = x-1;
            }
        }
        return x;
    }
}