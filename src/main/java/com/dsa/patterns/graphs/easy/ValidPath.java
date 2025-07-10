package com.dsa.patterns.graphs.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidPath {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for(int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<Integer>());
        }
        for(int[] edge: edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        return dfs(graph, source, destination, visited);
    }

    private boolean dfs(Map<Integer, ArrayList<Integer>> graph, int src, int dest, boolean[] visited) {
        if(src == dest) {
            return true;
        }
        visited[src] = true;
        for(int nbr : graph.get(src)) {
            if(!visited[nbr]) {
                boolean hasPath = dfs(graph, nbr, dest, visited);
                if(hasPath) {
                    return true;
                }
            }
        }
        return false;
    }
}
