//658. Find K Closest Elements

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[1] != b[1]) {
                    return Integer.compare(b[1], a[1]);
                }
                return Integer.compare(b[0], a[0]);
                }
            );
            for(int num : arr){
                int dist = Math.abs(num - x);
                pq.add(new int[] {num, dist});
                
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        ArrayList<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll()[0]);
        }
        Collections.sort(list);
        return list;
    }
}