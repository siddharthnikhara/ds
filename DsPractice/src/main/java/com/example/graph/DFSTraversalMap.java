package com.example.graph;

import java.util.*;

public class DFSTraversalMap {

    static void addEdge( int u, int v, boolean flag,Map<Integer, ArrayList<Integer>> map) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
        }
    }

    static void DFS(int v, boolean visited[], Map<Integer, ArrayList<Integer>> map) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = map.get(v).listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFS(n, visited, map);
        }
    }

    public static void main(String args[]) {
        int V = 5;
        boolean visited[] = new boolean[V];
        Map<Integer, ArrayList<Integer>> map = new HashMap();

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
//        addEdge(map, 0, 1, false);
//        addEdge(map, 0, 2, false);
//        addEdge(map, 1, 2, false);
//        addEdge(map, 2, 0, false);
//        addEdge(map, 2, 3, false);
//        addEdge(map, 3, 3, false);
        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
        DFS(2, visited, map);
    }
}