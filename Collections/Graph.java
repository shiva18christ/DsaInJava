package Collections;

import java.util.LinkedList;

public class Graph {
    int vertex;
    LinkedList<Integer>[] adjacentList;

    public Graph(int vertex) {
        this.vertex = vertex;
        this.adjacentList = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            adjacentList[i] = new LinkedList<>();
        }
    }

    public void insertEdge(int source, int destination) {
        adjacentList[source].add(destination);
    }


    public void display() {
        try {
            for (int i = 0; i < vertex; i++) {
                System.out.print(i + "-> ");
                for (int j = 0; j < adjacentList[i].size(); j++) {
                    System.out.print(adjacentList[i].get(j) + " ");
                }
                System.out.println();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }
    }
    public void DFS(int node,boolean[] visited){
        visited[node]=true;
        System.out.print(node+" ");
        for(int i=0;i<adjacentList[node].size();i++){
            int neighbour=adjacentList[node].get(i);
            if(!visited[neighbour]){
                DFS(neighbour,visited);
            }
        }

    }
    public void DFSTraversal(int start){
        boolean[] visited=new boolean[vertex];
        System.out.println("DFS traversal:");
        DFS(start,visited);
        System.out.println();
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 4);
        graph.insertEdge(2, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 4);
        graph.insertEdge(3, 5);
        graph.insertEdge(4, 5);
        graph.display();
        graph.DFSTraversal(0);
    }


}
