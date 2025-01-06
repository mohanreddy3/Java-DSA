package Graphs.Concepts;

import java.util.ArrayList;

public class AdjList {
    static class Edge{
        int src;
        int dest;
        int wt;
        //constructor
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        //no of vertices
        int  V = 5;
        //int[] arr = new int[size]
        ArrayList<Edge>[] graph = new ArrayList[V]; // at every index null is stored
        //create an Empty ArrayList at every index in the Array.
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        //0 vertex
        graph[0].add(new Edge(0, 1, 5));

        //1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //3 vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        //4 vertex
        graph[4].add(new Edge(4,2,2));

        //Node 2's Neighbors
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i); // src , dest , wt
            System.out.println(e.dest);
        }
    


    }
    
}
