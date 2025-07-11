package com.example.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BFSTraversal1 {

    private int V;
    private LinkedList<Integer> adj[];

    BFSTraversal1(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public static void main(String[] args) {
        BFSTraversal1 g = new BFSTraversal1(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
        g.BFS(2);

    }

    void BFS(int s) {
        LinkedList<Integer> queue =  new LinkedList<>();
        boolean visited[] =  new boolean[V];
        queue.add(s);
        visited[s] = true;
        queue.add(s);
        while(queue.size() != 0){
            s = queue.remove();
            System.out.print(s+" ");
            Iterator<Integer> itr =  adj[s].listIterator();
            while (itr.hasNext()){
                int n = itr.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
