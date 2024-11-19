package graph;

import java.util.ArrayList;
import java.util.*;


public class bfs {
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
    public static void bfscr(ArrayList<edge> graph[], int v,boolean visit[], int start){
        Queue<Integer> q= new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(visit[curr]==false){
                System.out.print(curr+" ");
                visit[curr]=true;
                for(int i=0; i<graph[curr].size(); i++){
                    edge e= graph[curr].get(i);
                    q.add(e.des);
                }

            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge> graph[]= new ArrayList[v];
        creategraph(graph);
        boolean visit[]=new boolean[v];
        for(int i=0; i<v; i++){
            if(visit[i]==false){
                bfscr(graph, v, visit, i);
            }
        }
        
        System.out.println();
    }}