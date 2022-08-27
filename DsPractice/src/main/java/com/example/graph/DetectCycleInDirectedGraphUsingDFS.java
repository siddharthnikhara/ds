package com.example.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DetectCycleInDirectedGraphUsingDFS {

    static void addEdge(Map<Integer, ArrayList<Integer>> map, int u, int v) {
        map.get(u).add(v);
    }

    static void printGraph(Map<Integer, ArrayList<Integer>> map) {
        for (int i = 1; i < map.size(); i++) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head  -> " + map.get(i));
            System.out.println();
        }
    }

    static boolean checkForCycle(int key, Map<Integer, Boolean> visited, Map<Integer, Boolean> dfsVisited, Map<Integer, ArrayList<Integer>> map) {
        visited.put(key, true);
        dfsVisited.put(key, true);
        for (int temp : map.get(key)) {
            if (!visited.getOrDefault(temp, false)) {
                boolean check = checkForCycle(temp, visited, dfsVisited, map);
                if (check) {
                    return true;
                }
            } else if (dfsVisited.getOrDefault(temp, false)) {
                return true;
            }
        }
        dfsVisited.put(key, false);
        return false;
    }

    public static void main(String args[]) {
        Map<Integer, ArrayList<Integer>> map = new HashMap();
        Map<Integer, Boolean> visited = new HashMap();
        Map<Integer, Boolean> dfsVisited = new HashMap();
        int V = 9;
        for (int i = 1; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        addEdge(map, 1, 2);
        addEdge(map, 2, 3);
        addEdge(map, 2, 4);
        addEdge(map, 3, 7);
        addEdge(map, 3, 8);
        addEdge(map, 8, 7);
        addEdge(map, 4, 5);
        addEdge(map, 5, 6);
        addEdge(map, 6, 4);

//        addEdge(0, 1,map);
//        addEdge(0, 2,map);
//        addEdge(1, 2,map);
//        addEdge(2, 0,map);
//        addEdge(2, 3,map);
//        addEdge(3, 3,map);
        printGraph(map);
        boolean isCycle = false;
        for (int i = 1; i < V; i++) {
            if (!visited.getOrDefault(i, false)) {
                isCycle = checkForCycle(i, visited, dfsVisited, map);
                if (isCycle) {
                    break;
                }
            }
        }
        if (isCycle) {
            System.out.println("find");
        } else {
            System.out.println("not find");
        }
    }
}
