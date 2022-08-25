package com.example.graph;

import java.util.*;

public class BFSTraversalMap {

    static void addEdge(int u, int v, boolean flag, Map<Integer, ArrayList<Integer>> map) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static void BFS(int key, Map<Integer, ArrayList<Integer>> map, boolean visited[]) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[key] = true;
        queue.add(key);
        while (queue.size() != 0) {
            int front = queue.remove();
            System.out.print(front + " ");
            for (int i : map.get(front)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    static void printGraph(Map<Integer, ArrayList<Integer>> map) {
        for (int i = 0; i < map.size(); i++) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head");
            for (int j = 0; j < map.get(i).size(); j++) {
                System.out.print(" -> " + map.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int V = 5;
        Map<Integer, ArrayList<Integer>> map = new HashMap();
        boolean visited[] = new boolean[V];
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
        printGraph(map);
        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                BFS(2, map, visited);
            }
        }
    }
}
