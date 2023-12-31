import java.util.ArrayList;

public class AllPaths {
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
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Now Enter values to Graph
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));
    }

    // Finding All Paths using dfs
    // Time Complexity O(V^V).
    public static void printAllPaths(ArrayList<Edge> graph[], int src, int tar, String path, boolean visited[]) {
        if (src == tar) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visited[e.dest]) {
                visited[e.dest] = true;
                printAllPaths(graph, e.dest, tar, path + e.dest, visited);
                visited[e.dest] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        int tar = 3;
        String path = "0";
        printAllPaths(graph, src, tar, path, new boolean[V]);
    }
}
