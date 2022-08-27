package com.example.graph;

import java.util.*;

public class DijkstraAlgorithm {

    static class Node implements Comparator<Node> {
        public int node;
        public int weight;

        public Node() {
        }

        public Node(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        @Override
        public int compare(Node node1, Node node2) {
            if (node1.weight < node2.weight) {
                return -1;
            }
            if (node1.weight > node2.weight) {
                return 1;
            }
            return 0;
        }
    }

    static class GraphPriorityQueue {
        int distance[];
        Set<Integer> visitedNode;
        PriorityQueue<Node> priorityQueue;
        int vertex;
        List<List<Node>> nodeList;

        public GraphPriorityQueue(int vertex) {
            this.vertex = vertex;
            distance = new int[vertex];
            visitedNode = new HashSet<Integer>();
            priorityQueue = new PriorityQueue<Node>(vertex, new Node());
        }

        public void dijkstraAlgo(List<List<Node>> node_list, int source_vertex) {
            this.nodeList = node_list;
            for (int x = 0; x < vertex; x++) {
                distance[x] = Integer.MAX_VALUE;
            }
            priorityQueue.add(new Node(source_vertex, 0));
            distance[source_vertex] = 0;
            while (visitedNode.size() != vertex) {
                int ux = priorityQueue.remove().node;
                visitedNode.add(ux);
                adjacentNodesGraph(ux);
            }
        }

        private void adjacentNodesGraph(int ux) {
            int edgeDistance = -1;
            int newDistance = -1;
            for (int x = 0; x < nodeList.get(ux).size(); x++) {
                Node vx = nodeList.get(ux).get(x);
                if (!visitedNode.contains(vx.node)) {
                    edgeDistance = vx.weight;
                    newDistance = distance[ux] + edgeDistance;
                    if (newDistance < distance[vx.node]) {
                        distance[vx.node] = newDistance;
                    }
                    priorityQueue.add(new Node(vx.node, distance[vx.node]));
                }
            }
        }
    }

    public static void main(String arg[]) {
        int Vertex = 6;
        int source_vertex = 0;
        List<List<Node>> Node_list = new ArrayList<List<Node>>();
        for (int i = 0; i < Vertex; i++) {
            List<Node> item = new ArrayList<Node>();
            Node_list.add(item);
        }

        Node_list.get(0).add(new Node(1, 5));
        Node_list.get(0).add(new Node(4, 2));
        Node_list.get(0).add(new Node(2, 3));
        Node_list.get(1).add(new Node(5, 2));
        Node_list.get(1).add(new Node(4, 3));
        Node_list.get(2).add(new Node(3, 3));
        Node_list.get(2).add(new Node(4, 2));

        GraphPriorityQueue gpq = new GraphPriorityQueue(Vertex);
        gpq.dijkstraAlgo(Node_list, source_vertex);

        System.out.println("The shortest paths from source nodes to all other nodes:");
        System.out.println("Source_Node\t\t" + "Other_Node#\t\t" + "Path_Distance");
        for (int x = 0; x < gpq.distance.length; x++) {
            System.out.println(source_vertex + " \t\t\t\t " + x + " \t\t\t\t " + gpq.distance[x]);
        }
    }
}
