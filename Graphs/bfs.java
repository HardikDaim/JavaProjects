import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    // Create Edge class
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    // Create Graph and insert elements.
    static void createGraph(ArrayList<Edge> graph[]) {
        // convert null to empty values
        for(int i = 0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        //Now Enter values to Graph
        graph[0].add(new Edge(0,1,1));
    }
    // Traversing using bfs
    public static void bfs(ArrayList<Edge> graph[], int V) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()) {
            int curr = q.remove();
            if(!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
            }
            // Neighbours
            for(int i = 0; i<graph[curr].size();i++) {
                Edge e = graph[curr].get(i);
                q.add(e.dest);
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 2;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph,2);
    }
}

