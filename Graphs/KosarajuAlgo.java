import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgo {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        // Mull to Empty Conversion
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

    }

    // Modified DFS
    public static void TopologicalSort(ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> stack) {
        vis[curr] = true;
        // Traverse Nerighbours
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                TopologicalSort(graph, vis, e.dest, stack);
            }
        }
        stack.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void KosarajuAlgo(ArrayList<Edge> graph[], int V) {
        // Step1
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                TopologicalSort(graph, vis, i, stack);
            }
        }
        // Step2 (Transpose of Graph)
        ArrayList<Edge> TransposeGraph[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            vis[i] = false;
            TransposeGraph[i] = new ArrayList<Edge>();
        }
        // Find Edges
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j); // e.src(i) -> e.dest
                TransposeGraph[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step3
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (!vis[curr]) {
                dfs(TransposeGraph, curr, vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        KosarajuAlgo(graph, V);
    }
}
