//3074. Apple Redistribution into Boxes

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum =0;
        int n = apple.length;
        
        for(int i =0; i<n; i++){
            sum += apple[i];
        }
        int[] fq = new int[51];
        int high = 0, low =51;
        for(int c : capacity){
            fq[c]++;
            high = Math.max(high,c);
            low = Math.min(low,c);
        }
        int res = 0;
        for(int i= high; i>=low && sum>0; i--){
            while(fq[i]-->0 && sum>0){
                sum-=i;
                res++;
            }
        }
        return res;
    }
}