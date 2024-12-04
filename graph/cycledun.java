package graph;

import java.util.ArrayList;

public class cycledun {
    static class edge{
        int src;
        int des;
        public edge(int s, int d){
            this.src=s;
            this.des=d;

        }
    }
    public static void creategraph(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 1));

        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));

        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));
        
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<edge> graph[]= new ArrayList[v];
        creategraph(graph);
    }
}
