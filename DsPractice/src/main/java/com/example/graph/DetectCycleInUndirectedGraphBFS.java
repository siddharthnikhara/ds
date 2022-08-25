package com.example.graph;

import java.util.*;

public class DetectCycleInUndirectedGraphBFS {

    static void addEdge(int u, int v, boolean flag, Map<Integer, ArrayList<Integer>> map) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static boolean isCyclicConntected(int key, Map<Integer, ArrayList<Integer>> map, Map<Integer, Boolean> visited) {
        Map<Integer, Integer> parent = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        parent.put(key, -1);
        visited.put(key, true);
        q.add(key);
        while (!q.isEmpty()) {
            int front = q.remove();
            for (int neighour : map.get(front)) {
                if (visited.getOrDefault(neighour, false) && neighour != parent.get(front)) {
                    return true;
                } else if (!visited.getOrDefault(neighour, false)) {
                    q.add(neighour);
                    visited.put(neighour, true);
                    parent.put(neighour, front);
                }
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        Map<Integer, ArrayList<Integer>> map = new HashMap();
        Map<Integer, Boolean> visited = new HashMap();
        for (int i = 0; i < 5; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        addEdge(1, 0, false, map);
        addEdge(0, 2, false, map);
        addEdge(2, 1, false, map);
        addEdge(0, 3, false, map);
        addEdge(3, 4, false, map);
        boolean ans = false;
//        addEdge(0, 1, false);
//        addEdge(1, 2, false);
//        addEdge(2, 0, false);
//        addEdge(2, 3, false);
        for (int i = 0; i < 5; i++) {
            ans = isCyclicConntected(i, map, visited);
        }
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

