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
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 4));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));
        // graph[1].add(new edge(1, 4));

        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 2));

        graph[4].add(new edge(4, 0));
        // graph[4].add(new edge(4, 1));
        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 4));
   
    }
    public static boolean cycledundirected(ArrayList<edge> graph[], boolean  iv[], int curr, int par){
        iv[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            if(iv[e.des] && e.des!=par){
                return true;
            }
            else if(!iv[e.des]){
               if(cycledundirected(graph, iv, e.des, curr)){
                return true;
               }
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        int v=6;
        ArrayList<edge> graph[]= new ArrayList[v];
        creategraph(graph);
        System.out.println(cycledundirected(graph, new boolean[v], 0, -1));
    }
}
