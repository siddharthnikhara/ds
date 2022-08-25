package com.example.graph;

import java.util.*;

public class DFSTraversalMapAnotherWay {

    static void addEdge(int u, int v, boolean flag, Map<Integer, ArrayList<Integer>> map) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static void DFS(int v, Map<Integer, ArrayList<Integer>> map, Map<Integer, Boolean> visited) {
        visited.put(v, true);
        System.out.print(v + " ");
        Iterator<Integer> i = map.get(v).listIterator();
        while (i.hasNext()) {
            int temp = i.next();
            if (!visited.getOrDefault(temp, false)) {
                DFS(temp, map, visited);
            }
        }
    }

    public static void main(String args[]) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Map<Integer, Boolean> visited = new HashMap<>();
        int V = 5;
        for (int i = 0; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        addEdge(0, 1, false, map);
        addEdge(0, 4, false, map);
        addEdge(1, 2, false, map);
        addEdge(1, 3, false, map);
        addEdge(1, 4, false, map);
        addEdge(2, 3, false, map);
        addEdge(3, 4, false, map);
//        addEdge(map, 0, 1);
//        addEdge(map, 0, 2);
//        addEdge(map, 1, 2);
//        addEdge(map, 2, 0);
//        addEdge(map, 2, 3);
//        addEdge(map, 3, 3);
        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
        DFS(2, map, visited);
    }
}