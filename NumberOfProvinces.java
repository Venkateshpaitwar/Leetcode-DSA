// 547. Number of Provinces

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        int[] vis = new int[v + 1];
        vis[0] = 1;
        int count = 0;
        for(int i = 0; i < v; i++){
            if(vis[i] == 0){
                count++;
                dfs(i, isConnected, vis);
            }
        }
        return count;
    }
    private void dfs(int node, int[][] isConnected, int[] vis){
        vis[node] = 1;
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[node][i] == 1 && vis[i] == 0){
                dfs(i, isConnected, vis);
            }
        }
    }
}