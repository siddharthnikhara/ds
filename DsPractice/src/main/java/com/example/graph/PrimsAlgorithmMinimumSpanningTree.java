package com.example.graph;

import java.lang.*;

public class PrimsAlgorithmMinimumSpanningTree {

    static int selectMinVertex(int[] value, boolean[] setMST) {
        int minimum = Integer.MAX_VALUE;
        int vertex = 0;
        for (int i = 0; i < value.length; i++) {
            if (setMST[i] == false && value[i] < minimum) {
                vertex = i;
                minimum = value[i];
            }
        }
        return vertex;
    }

    static void printMst(int[] parent, int[][] graph) {
        System.out.println("Src.\tDest.\tWeight\n");
        for (int i = 1; i < parent.length; i++) {
            System.out.println(i + "\t" + parent[i] + "\t" + graph[i][parent[i]] + "\n");
        }
    }

    static void findMST(int graph[][]) {
        int V = graph.length;
        int[] parent = new int[V];
        int[] value = new int[V];
        boolean[] setMST = new boolean[V];
        for (int i = 0; i < V; i++) {
            value[i] = Integer.MAX_VALUE;
        }

        parent[0] = -1;
        value[0] = 0;

        for (int i = 0; i < V - 1; i++) {
            int U = selectMinVertex(value, setMST);
            setMST[U] = true;
            for (int j = 0; j < V; j++) {
                if (graph[U][j] != 0 && setMST[j] == false && graph[U][j] < value[j]) {
                    value[j] = graph[U][j];
                    parent[j] = U;
                }
            }
        }
        printMst(parent, graph);
    }


    public static void main(String[] args) {
        int[][] graph = {
                {0, 4, 6, 0, 0, 0},
                {4, 0, 6, 3, 4, 0},
                {6, 6, 0, 1, 8, 0},
                {0, 3, 1, 0, 2, 3},
                {0, 4, 8, 2, 0, 7},
                {0, 0, 0, 3, 7, 0},
        };
        findMST(graph);
    }
}
