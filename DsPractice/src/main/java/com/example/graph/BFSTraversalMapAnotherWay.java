package com.example.graph;

import java.util.*;

public class BFSTraversalMapAnotherWay {
    static Map<Integer, ArrayList<Integer>> map = new HashMap();
    static Queue<Integer> queue = new LinkedList<Integer>();
    static Map<Integer, Boolean> visited = new HashMap();
    static List<Integer> ans = new ArrayList<>();

    static void addEdge(int u, int v, boolean flag) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static void printGraph() {
        for (int i = 0; i < map.size(); i++) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head");
            for (int j = 0; j < map.get(i).size(); j++) {
                System.out.print(" -> " + map.get(i).get(j));
            }
            System.out.println();
        }
    }

    static List<Integer> BFS(int n) {
        visited.put(n, true);
        queue.add(n);
        while (queue.size() != 0) {
            n = queue.remove();
            System.out.print(n + " ");
            ans.add(n);
            for (int i = 0; i < map.get(n).size(); i++) {
                int a = map.get(n).get(i);
                if (!visited.getOrDefault(a, false)) {
                    visited.put(a, true);
                    queue.add(a);
                }
            }
        }
        return ans;
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
        printGraph();
        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
        BFS(2).forEach(System.out::println);
    }
}
