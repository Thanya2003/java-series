package graph;

import java.util.ArrayList;

public class cycled {
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
         graph[0].add(new edge(0, 2));
         graph[1].add(new edge(1, 0));
         graph[2].add(new edge(2, 3));
         graph[3].add(new edge(3, 0));
    }
    public static boolean cycledirected(ArrayList<edge> graph[], int curr, boolean visit[], boolean rec[]){
        visit[curr]=true;
        rec[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            edge e=graph[curr].get(i);
            if(rec[e.des]){
                return true;
            }
            else if(!visit[e.des]){
               if(cycledirected(graph, e.des, visit, rec)){
                return true;
               }
            }
        }
        rec[curr]=false;
        return false;
        }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[]= new ArrayList[v];
        creategraph(graph);
        boolean vis[]= new boolean[v];
        boolean rec[]= new boolean[v];
        for(int i=0; i<v; i++){
        if(!vis[i]){
        boolean iscycle = cycledirected(graph, 0, vis, rec);
        if(iscycle){
            System.out.println(iscycle);
            break;
        }
    }
}
}
}
