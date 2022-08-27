package com.example.graph;

import java.util.*;

public class TopologicalSortKahnsAlgo {

    static void addEdge(Map<Integer, ArrayList<Integer>> map, int u, int v) {
        map.get(u).add(v);
    }

    static void printGraph(Map<Integer, ArrayList<Integer>> map) {
        for (int i = 1; i <= map.size(); i++) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head  -> " + map.get(i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Map<Integer, ArrayList<Integer>> map = new HashMap();
        int V = 6;
        for (int i = 1; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        addEdge(map, 1, 2);
        addEdge(map, 1, 3);
        addEdge(map, 2, 5);
        addEdge(map, 3, 5);
        addEdge(map, 5, 4);
//        addEdge(map, 4, 6);
        printGraph(map);

        int indegree[] = new int[V];
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> l = entry.getValue();
            for (int a : l) {
                indegree[a]++;
            }
        }

        Queue<Integer> queue = new LinkedList();
        for (int i = 1; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        Set<Integer> set = new LinkedHashSet<>();

        //do bfs
        while (!queue.isEmpty()) {
            int front = queue.remove();
            set.add(front);

            //neighour
            for (int temp : map.getOrDefault(front, null)) {
                indegree[temp]--;
                if (indegree[temp] == 0) {
                    queue.add(temp);
                }
            }
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}
