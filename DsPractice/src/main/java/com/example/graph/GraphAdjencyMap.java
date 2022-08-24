package com.example.graph;

import java.util.*;

public class GraphAdjencyMap {

    static void addEdge(Map<Integer, ArrayList<Integer>> map, int u, int v, boolean flag) {
        map.get(u).add(v);
        if (flag == false) {
            map.get(v).add(u);
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

    public static void main(String[] args) {
        int V = 5;
        Map<Integer, ArrayList<Integer>> map = new HashMap();

        for (int i = 0; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
//        addEdge(map, 0, 1, false);
//        addEdge(map, 0, 2, false);
//        addEdge(map, 1, 2, false);
//        addEdge(map, 2, 0, false);
//        addEdge(map, 2, 3, false);
//        addEdge(map, 3, 3, false);
        addEdge(map, 0, 1, false);
        addEdge(map, 0, 4, false);
        addEdge(map, 1, 2, false);
        addEdge(map, 1, 3, false);
        addEdge(map, 1, 4, false);
        addEdge(map, 2, 3, false);
        addEdge(map, 3, 4, false);
        printGraph(map);
    }
}
