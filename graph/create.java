package graph;

import java.util.ArrayList;

public class create {
    static class edge{
        int src;
        int des;
        int wght;
        public edge(int s, int d , int w){
            this.src=s;
            this.des=d;
            this.wght=w;
        }
    }
    public static void creategraph(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 2, 10));

        graph[1].add(new edge(1, 2, 5));
        graph[1].add(new edge(1, 3, 6));

        graph[2].add(new edge(2, 0,10));
        graph[2].add(new edge(2, 1,3));
        graph[2].add(new edge(2, 3,2));

        graph[3].add(new edge(3, 1,-1));
        graph[3].add(new edge(3, 2,4));

    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[]= new ArrayList[v];
        creategraph(graph);

        for(int i=0; i<graph[2].size(); i++){
            edge e = graph[2].get(i);
            System.out.println(e.des+"->"+e.wght);

        }
    }
}
