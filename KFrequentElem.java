// 347. Top K Frequent Elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[1] != b[1]) {
                    return Integer.compare(b[1], a[1]);
                }
                return Integer.compare(b[0], a[0]);
                }
            );
        int[] count = new int[20001];
        for(int num : nums){
            count[num + 10000]++;
        }
        for(int num : set){
            pq.add(new int[] {num, count[num + 10000]});
            if(pq.size() > k){
                pq.poll();
            }
        }
        ArrayList<Integer>list = new ArrayList<>();
        
        while(!pq.isEmpty()){
            list.add(pq.poll()[0]);
        }
        Collections.sort(list);
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}