package com.example.graph;

import java.util.*;

public class BFSTraversalMap {
    static Map<Integer, ArrayList<Integer>> map = new HashMap();

    static void addEdge(int u, int v, boolean flag) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static void BFS(int s) {
        boolean visited[] = new boolean[map.size()];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.remove();
            System.out.print(s + " ");
            Iterator<Integer> i = map.get(s).listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
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
        BFS(2);
    }
}
