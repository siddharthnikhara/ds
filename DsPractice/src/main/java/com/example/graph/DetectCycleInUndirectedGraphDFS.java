package com.example.graph;

import java.util.*;

public class DetectCycleInUndirectedGraphDFS {

    static Map<Integer, Boolean> visited = new HashMap<>();

    static void addEdge(Map<Integer, ArrayList<Integer>> map, int u, int v, boolean flag) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    Boolean isCyclicUtil(int v, int parent, Map<Integer, ArrayList<Integer>> map) {
        visited.put(v, true);
        Integer i;
        Iterator<Integer> it = map.get(v).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited.getOrDefault(i, false)) {
                if (isCyclicUtil(i, v, map)) {
                    return true;
                }
            } else if (i != parent) {
                return true;
            }
        }
        return false;
    }

    Boolean isCyclic(Map<Integer, ArrayList<Integer>> map) {
        boolean visited[] = new boolean[map.size()];
        Arrays.fill(visited, false);
        for (int u = 0; u < map.size(); u++) {
            if (!visited[u]) {
                if (isCyclicUtil(u, -1, map)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        Map<Integer, ArrayList<Integer>> map = new HashMap();
        for (int i = 0; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        DetectCycleInUndirectedGraphDFS g1 = new DetectCycleInUndirectedGraphDFS();
        addEdge(map, 1, 0, false);
        addEdge(map, 0, 2, false);
        addEdge(map, 2, 1, false);
        addEdge(map, 0, 3, false);
        addEdge(map, 3, 4, false);
        if (g1.isCyclic(map)) {
            System.out.println("Graph  contains cycle");
        } else {
            System.out.println("Graph doesn 't contains cycle");
        }

        Map<Integer, ArrayList<Integer>> map1 = new HashMap();
        int K = 3;
        for (int i = 0; i < K; i++) {
            map1.put(i, new ArrayList<Integer>());
        }
        DetectCycleInUndirectedGraphDFS g2 = new DetectCycleInUndirectedGraphDFS();
        addEdge(map1, 0, 1, false);
        addEdge(map1, 1, 2, false);
        if (g2.isCyclic(map1)) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn 't contains cycle");
        }
    }
}
