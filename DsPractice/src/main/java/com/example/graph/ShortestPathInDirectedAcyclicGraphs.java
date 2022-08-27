package com.example.graph;

import java.util.*;

public class ShortestPathInDirectedAcyclicGraphs {
    static int V;
    static final int INF = Integer.MAX_VALUE;

    static class Node {
        int v;
        int wt;

        Node(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
    }

    static List<List<Node>> adj;

    static void addEdge(int u, int v, int wt) {
        adj.get(u).add(new Node(v, wt));
    }

    static void topologicalSort(int v, boolean visited[], Stack<Integer> st) {
        visited[v] = true;
        for (Node node : adj.get(v)) {
            if (!visited[node.v]) {
                topologicalSort(node.v, visited, st);
            }
        }
        st.push(v);
    }

    static void shortestPath(int src) {
        Stack<Integer> st = new Stack<>();
        int dist[] = new int[V];
        Arrays.fill(dist, INF);
        dist[src] = 0;
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSort(i, visited, st);
            }
        }
        while (!st.isEmpty()) {
            int u = st.pop();
            if (dist[u] != INF) {
                for (Node node : adj.get(u)) {
                    if (dist[node.v] > dist[u] + node.wt)
                        dist[node.v] = dist[u] + node.wt;
                }
            }
        }
        for (int i = 0; i < V; i++) {
            if (dist[i] == INF)
                System.out.print("INF ");
            else
                System.out.print(dist[i] + " ");
        }

    }

    public static void main(String args[]) {
        V = 6;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Node>());
        }

        addEdge(0, 2, 4);
        addEdge(1, 0, 3);
        addEdge(2, 3, -3);
        addEdge(2, 4, 2);
        addEdge(1, 2, 2);
        addEdge(1, 3, 5);
        addEdge(4, 3, 2);
        shortestPath(1);
    }
}
