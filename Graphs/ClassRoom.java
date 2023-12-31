
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ClassRoom {
    static class Edge {
        int src;
        int dest;
        int wt;
        // Constructor
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    
    public static void CreateGraph(ArrayList<Edge> graph[]) {
        // Create Empty ArrayList to convert NULL to Empty.
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        // Now add Elements to Graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
    }

    public static void bfs(ArrayList<Edge> graph[], int V) {
        // Java Inbuild Queue
        Queue<Integer> q =new LinkedList<>();
        boolean vis[] = new boolean[V];
        // Starting Point to 0
        q.add(0);
        while(!q.isEmpty()) {
            int currNode = q.remove();
            if(vis[currNode] == false) {
                System.out.print(currNode + " ");
                vis[currNode] = true;
                // Selecting the Neighbours of current Node.
                for(int i = 0; i<graph[currNode].size(); i++) {
                    Edge e = graph[currNode].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge> graph[], int currNode, boolean vis[]) { 
        System.out.println(currNode+" ");
        vis[currNode] = true;
        for(int i = 0; i<graph[currNode].size(); i++) {
            Edge e = graph[currNode].get(i);
            if(vis[e.dest] == false) {
                dfs(graph,e.dest, vis);
            }
        }
    }
    
    public static void main(String[] args) {
        int V = 7;  // Vertices or Nodes

        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        boolean vis[] = new boolean[V];
        // bfs(graph, V);
        // dfs(graph,currNode ,vis);
        // System.out.println();
        // Print 2's Neighbours
        // for (int i = 0; i < graph[2].size(); i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest + " , " + e.wt);
        // }
    }
}   
