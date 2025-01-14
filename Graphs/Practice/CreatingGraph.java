package Graphs.Practice;

import java.util.ArrayList;

public class CreatingGraph {

    //Strcture for an Edge
    static class Edge{
        int src; 
        int dest; 
        int wt;
    
        //Constr
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    //main
    public static void main(String[] args) {
        //no of vertices
        int Vrt = 5;
        //create an Array of ArrayLists
        ArrayList<Edge>[] graph = new ArrayList[Vrt];
        //at first array contains null -> create empty ArrayLists
        for(int i=0; i<Vrt; i++){
            graph[i] = new ArrayList<>();          
        }
        
        // vrt 0
        graph[0].add(new Edge(0,1,5));

        //Vertex 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //Vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //Vertex 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //Vertex 4
        graph[4].add(new Edge(4, 2, 2));


        //Operation : Find all Neighbors for Vertex 2.
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i); // it gives us -> (src, dest, wt)
            System.out.println(e.dest); // we need it's Neighbors -> dest
        }

    }
    
}
