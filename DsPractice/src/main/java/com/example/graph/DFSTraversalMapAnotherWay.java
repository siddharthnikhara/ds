package com.example.graph;

import java.util.*;

public class DFSTraversalMapAnotherWay {

    static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    static Map<Integer, Boolean> visited = new HashMap<>();

    static void addEdge(int u, int v, boolean flag) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static void DFS(int v) {
        visited.put(v, true);
        System.out.print(v + " ");
        Iterator<Integer> i = map.get(v).listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited.getOrDefault(n, false)) {
                DFS(n);
            }
        }
    }

    public static void main(String args[]) {
        int V = 5;
        for (int i = 0; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        addEdge(0, 1, false);
        addEdge(0, 4, false);
        addEdge(1, 2, false);
        addEdge(1, 3, false);
        addEdge(1, 4, false);
        addEdge(2, 3, false);
        addEdge(3, 4, false);
//        addEdge(map, 0, 1);
//        addEdge(map, 0, 2);
//        addEdge(map, 1, 2);
//        addEdge(map, 2, 0);
//        addEdge(map, 2, 3);
//        addEdge(map, 3, 3);
        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
        DFS(2);
    }
}