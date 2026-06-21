// 1833. Maximum Ice Cream Bars

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;
        for(int cost : costs){
            maxCost = Math.max(maxCost, cost);
        }
        int freq[] = new int[maxCost + 1];
        for(int cost : costs){
            freq[cost]++;
        }
        int count = 0;
        for(int cost = 0; cost <= maxCost; cost++){
            if(freq[cost] == 0) continue;
            int bars = Math.min(freq[cost] , coins / cost);
            count += bars;
            coins -= bars * cost;

            if(coins < cost){
                break;
            }
        }
        return count;
    }
}
//         Arrays.sort(costs);
//         int icecreams = 0;
//         int count = 0;
//         for(int i = 0; i < costs.length; i++){
//             if(icecreams + costs[i] <= coins){
//                 icecreams += costs[i];
//                 count++;
//             }
//         }
//         return count;
//     }
// }