package graph;

import java.util.ArrayList;

public class dfs {
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
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 4));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));

        graph[4].add(new edge(4, 2));
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));
        graph[5].add(new edge(5, 6));

        graph[6].add(new edge(6, 5));
    }
    public static void dfscr(ArrayList<edge> graph[], boolean visit[], int curr){
        System.out.print(curr+" ");
        visit[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            edge e=graph[curr].get(i);
            if(visit[e.des]==false)
                dfscr(graph, visit, e.des);
        }

    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge> graph[]= new ArrayList[v];
        creategraph(graph);
        boolean visit[]=new boolean[v];
        dfscr(graph, visit, 0);
        System.out.println();
    }
}
