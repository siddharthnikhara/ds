package com.example.graph;

import java.util.*;

public class ShortestPathInUnWeightedGraph {


    static void addEdge(Map<Integer, ArrayList<Integer>> map, int u, int v) {
        map.get(u).add(v);
        map.get(v).add(u);
    }

    static void printGraph(Map<Integer, ArrayList<Integer>> map) {
        for (int i = 0; i < map.size(); i++) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head");
            System.out.print(" -> " + map.get(i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Map<Integer, ArrayList<Integer>> map = new HashMap();
        Map<Integer, Boolean> visited = new HashMap();
        Map<Integer, Integer> parent = new HashMap();
        int V = 19;
        for (int i = 1; i < V; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        addEdge(map, 1, 2);
        addEdge(map, 1, 3);
        addEdge(map, 1, 4);
        addEdge(map, 2, 1);
        addEdge(map, 2, 5);
        addEdge(map, 3, 1);
        addEdge(map, 3, 8);
        addEdge(map, 4, 6);
        addEdge(map, 4, 1);
        addEdge(map, 5, 2);
        addEdge(map, 5, 8);
        addEdge(map, 6, 4);
        addEdge(map, 6, 7);
        addEdge(map, 7, 6);
        addEdge(map, 7, 8);
        addEdge(map, 8, 3);
        addEdge(map, 8, 5);
        addEdge(map, 8, 7);
        printGraph(map);

        int s = 1;
        int t = 8;
        Queue<Integer> queue = new LinkedList<Integer>();
        visited.put(s, true);
        parent.put(s,-1);//sayad ye aaega, and aana chahiye, but verify once with internet code
        queue.add(s);

        while (queue.size() != 0) {
            int frontNode = queue.remove();
            for (int i : map.get(frontNode)) {
                if (!visited.getOrDefault(i, false)) {
                    visited.put(i, true);
                    parent.put(i, frontNode);
                    queue.add(i);
                }
            }
        }

        //prepare shortes path
        List<Integer> ans = new ArrayList<>();
        ans.add(t);
        int current = t;
        while (current != s) {
            current = parent.getOrDefault(current, 0);
            ans.add(current);
        }
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
