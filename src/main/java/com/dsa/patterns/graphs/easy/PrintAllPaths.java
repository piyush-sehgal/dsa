package com.dsa.patterns.graphs.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrintAllPaths {
    public void printAllPaths(int n, int[][] edges, int source, int destination) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for(int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<Integer>());
        }
        for(int[] edge: edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        dfs(graph, source, destination, visited, source + " ");
    }

    private void dfs(Map<Integer, ArrayList<Integer>> graph, int src, int dest, boolean[] visited, String psf) {
        if(src == dest) {
            System.out.println(psf);
            return;
        }
        visited[src] = true;
        for(int nbr : graph.get(src)) {
            if(!visited[nbr]) {
                dfs(graph, nbr, dest, visited, psf + nbr + " ");
            }
        }
        visited[src] = false;
    }
}
