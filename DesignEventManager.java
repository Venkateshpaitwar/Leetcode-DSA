// 3885. Design Event Manager

import java.util.*;
class EventManager {
    HashMap<Integer, Integer> map;
    PriorityQueue <int[]> pq;
    public EventManager(int[][] events) {
        map = new HashMap<>();
        pq = new PriorityQueue<>((a, b) -> {
            if(b[0] != a[0]) return b[0] - a[0];
            return a[1] - b[1];
        });
        for(int[] e : events){
            int id = e[0];
            int priority = e[1];
            map.put(id, priority);
            pq.offer(new int[]{priority, id});
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId, newPriority);
        pq.offer(new int[]{newPriority, eventId});
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[] top = pq.poll();
            int priority = top[0];
            int id = top[1];

            if(map.containsKey(id) && map.get(id) == priority){
                map.remove(id);
                return id;
            }
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */