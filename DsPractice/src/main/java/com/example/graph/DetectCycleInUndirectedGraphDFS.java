package com.example.graph;

import java.util.*;

public class DetectCycleInUndirectedGraphDFS {

    static void addEdge(int u, int v, boolean flag, Map<Integer, ArrayList<Integer>> map) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static Boolean isCyclicConntected(int key, int parent, Map<Integer, Boolean> visited, Map<Integer, ArrayList<Integer>> map) {
        visited.put(key, true);
        for (int neighour : map.get(key)) {
            if (!visited.getOrDefault(neighour, false)) {
                boolean isdetected = isCyclicConntected(neighour, key, visited, map);
                if (isdetected) {
                    return true;
                }
            } else if (neighour != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        Map<Integer, Boolean> visited = new HashMap<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap();
        for (int i = 0; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        addEdge(1, 0, false, map);
        addEdge(0, 2, false, map);
        addEdge(2, 4, false, map);
        addEdge(0, 3, false, map);
        addEdge(3, 4, false, map);
        boolean ans = false;
        for (int i = 0; i < V; i++) {
            ans = isCyclicConntected(0, -1, visited, map);
        }
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
