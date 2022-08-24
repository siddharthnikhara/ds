package com.example.graph;

import java.util.*;

public class DFSTraversalMap {
    static Map<Integer, ArrayList<Integer>> map = new HashMap();

    static void addEdge(Map<Integer, ArrayList<Integer>> map, int u, int v, boolean flag) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static void DFSUtil(int v, boolean visited[], Map<Integer, ArrayList<Integer>> map) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = map.get(v).listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited, map);
        }
    }

    static void DFS(int v, Map<Integer, ArrayList<Integer>> map) {
        boolean visited[] = new boolean[map.size()];
        DFSUtil(v, visited, map);
    }

    public static void main(String args[]) {
        int V = 5;

        for (int i = 0; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        addEdge(map, 0, 1, false);
        addEdge(map, 0, 2, false);
        addEdge(map, 1, 2, false);
        addEdge(map, 2, 0, false);
        addEdge(map, 2, 3, false);
        addEdge(map, 3, 3, false);
        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
        DFS(2, map);
    }
}