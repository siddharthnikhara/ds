package com.example.graph;

import java.util.*;

public class DetectCycleInUndirectedGraphBFS {

    static Map<Integer, ArrayList<Integer>> map = new HashMap();

    static void addEdge(int u, int v, boolean flag) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static boolean isCyclicConntected(int s, int V, boolean visited[]) {
        int parent[] = new int[V];
        Arrays.fill(parent, -1);
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.remove();
            for (int i = 0; i < map.get(u).size(); i++) {
                int v = map.get(u).get(i);
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                    parent[v] = u;
                } else if (parent[u] != v) return true;
            }
        }
        return false;
    }


    static boolean isCyclicDisconntected(int V) {
        boolean visited[] = new boolean[V];
        Arrays.fill(visited, false);
        for (int i = 0; i < V; i++) {
            if (!visited[i] && isCyclicConntected(i, V, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        for (int i = 0; i < 5; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        addEdge(1, 0, false);
        addEdge(0, 2, false);
        addEdge(2, 1, false);
        addEdge(0, 3, false);
        addEdge(3, 4, false);

//        addEdge(0, 1, false);
//        addEdge(1, 2, false);
//        addEdge(2, 0, false);
//        addEdge(2, 3, false);
        if (isCyclicDisconntected(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
