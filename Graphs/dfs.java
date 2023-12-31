import java.util.ArrayList;

public class dfs {
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
    // Traversing in dfs using Recursion
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        if(visited[curr] ) {
            return;
        }
       System.out.print(curr + " ");
       visited[curr] = true;
       for(int i = 0; i<graph[curr].size();i++) {
        Edge e = graph[curr].get(i);
        dfs(graph, e.dest, visited);
       }
    }

    public static void main(String[] args) {
        int V = 2;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dfs(graph,0 , new boolean[V]);
    }
}

