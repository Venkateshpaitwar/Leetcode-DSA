// 2685. Count the Number of Complete Components

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        boolean[] visited = new boolean[n];
        int complete = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int[] res = dfs(i, graph, visited);
                int nodes = res[0];
                int degreeSum = res[1];
                int edgeCount = degreeSum / 2;
                if (edgeCount == nodes * (nodes - 1) / 2) {
                    complete++;
                }
            }
        }
        return complete;
    }

    private int[] dfs(int node, List<Integer>[] graph, boolean[] visited) {
        visited[node] = true;
        int nodes = 1;
        int degreeSum = graph[node].size();
        for (int nei : graph[node]) {
            if (!visited[nei]) {
                int[] res = dfs(nei, graph, visited);
                nodes += res[0];
                degreeSum += res[1];
            }
        }
        return new int[]{nodes, degreeSum};
    }
}