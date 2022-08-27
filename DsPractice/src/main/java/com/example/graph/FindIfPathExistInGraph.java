package com.example.graph;

import java.util.*;

public class FindIfPathExistInGraph {

    static void addEdge(int u, int v, boolean flag, Map<Integer, LinkedHashSet<Integer>> map) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static void printGraph(Map<Integer, LinkedHashSet<Integer>> map) {
        for (int i = 0; i < map.size(); i++) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head");
            System.out.print(" -> " + map.get(i));
            System.out.println();
        }
    }

    static void BFS(int n, Map<Integer, LinkedHashSet<Integer>> map, Map<Integer, Boolean> visited) {
        Queue<Integer> queue = new LinkedList<Integer>();
        visited.put(n, true);
        queue.add(n);
        while (queue.size() != 0) {
            int frontNode = queue.remove();
            for (int i : map.get(frontNode)) {
                if (!visited.getOrDefault(i, false)) {
                    visited.put(i, true);
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {

        Map<Integer, LinkedHashSet<Integer>> map = new HashMap();
        Map<Integer, Boolean> visited = new HashMap();
        int V = 9;
        for (int i = 0; i < V; i++) {
            map.put(i, new LinkedHashSet<Integer>());
        }
        addEdge(0, 1, false, map);
        addEdge(0, 4, false, map);
        addEdge(1, 2, false, map);
        addEdge(1, 3, false, map);
        addEdge(1, 4, false, map);
        addEdge(2, 3, false, map);
        addEdge(3, 4, false, map);
        addEdge(5, 6, false, map);
        printGraph(map);
        for (int i = 0; i < V; i++) {
            if (!visited.getOrDefault(i, false)) {
                BFS(2, map, visited);
            }
        }
        System.out.println(visited.getOrDefault(2, false));
    }
}
