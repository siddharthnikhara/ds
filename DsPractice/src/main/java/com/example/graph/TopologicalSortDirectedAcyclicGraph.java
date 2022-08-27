package com.example.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TopologicalSortDirectedAcyclicGraph {
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

    static boolean topologicalSort(int key, Map<Integer, Boolean> visited, Stack<Integer> stack, Map<Integer, ArrayList<Integer>> map, boolean res) {

        visited.put(key, true);
        for (int temp : map.get(key) ) {
            if (!visited.getOrDefault(temp, false)) {
                res = true;
                topologicalSort(temp, visited, stack, map, res);
            }
        }
        stack.push(key);
        return res;
    }

    public static void main(String[] args) {
        Map<Integer, ArrayList<Integer>> map = new HashMap();
        Map<Integer, Boolean> visited = new HashMap();
        Stack<Integer> stack = new Stack<>();
        int V = 7;
        for (int i = 1; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        addEdge(map, 1, 2);
        addEdge(map, 1, 3);
        addEdge(map, 2, 4);
        addEdge(map, 3, 4);
        addEdge(map, 4, 5);
        addEdge(map, 5, 6);
        addEdge(map, 4, 6);
        boolean res = false;
        printGraph(map);
        for (int i = 1; i < V; i++) {
            if (!visited.getOrDefault(i, false)) {
                res = topologicalSort(i, visited, stack, map, res);
                if (res) {
                    System.out.print("Topological Sort");
                    break;
                }
            }
        }
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

