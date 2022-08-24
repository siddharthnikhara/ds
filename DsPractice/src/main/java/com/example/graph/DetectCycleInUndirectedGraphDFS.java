package com.example.graph;

import java.util.*;

public class DetectCycleInUndirectedGraphDFS {

    static Map<Integer, Boolean> visited = new HashMap<>();
    static Map<Integer, ArrayList<Integer>> map = new HashMap();
    static Map<Integer, ArrayList<Integer>> map1 = new HashMap();


    static void addEdge(int u, int v, boolean flag) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static Boolean isCyclicUtil(int v, int parent) {
        visited.put(v, true);
        Integer i;
        Iterator<Integer> it = map.get(v).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited.getOrDefault(i, false)) {
                if (isCyclicUtil(i, v)) {
                    return true;
                }
            } else if (i != parent) {
                return true;
            }
        }
        return false;
    }

    static Boolean isCyclic() {
        for (int u = 0; u < map.size(); u++) {
            if (!visited.getOrDefault(u, false)) {
                if (isCyclicUtil(u, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        for (int i = 0; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        DetectCycleInUndirectedGraphDFS g1 = new DetectCycleInUndirectedGraphDFS();
        addEdge(1, 0, false);
        addEdge(0, 2, false);
        addEdge(2, 1, false);
        addEdge(0, 3, false);
        addEdge(3, 4, false);
        if (g1.isCyclic()) {
            System.out.println("Graph  contains cycle");
        } else {
            System.out.println("Graph doesn 't contains cycle");
        }

        int K = 3;
        for (int i = 0; i < K; i++) {
            map1.put(i, new ArrayList<Integer>());
        }
        DetectCycleInUndirectedGraphDFS g2 = new DetectCycleInUndirectedGraphDFS();
        addEdge(0, 1, false);
        addEdge(1, 2, false);
        if (g2.isCyclic()) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn 't contains cycle");
        }
    }
}
