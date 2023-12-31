import java.util.ArrayList;

public class cycleDetectionDirected {
    // Directed Graph
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCyclicDirected(ArrayList<Edge> graph[], boolean vis[], int curr, boolean recursive_stack[]) {
        vis[curr] = true;
        recursive_stack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (recursive_stack[e.dest]) {
                return true;
            } else if (!vis[e.dest]) {
                if (isCyclicDirected(graph, vis, e.dest, recursive_stack)) {
                    return true;
                }
            }
        }
        recursive_stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCyclicDirected(graph, new boolean[V], 0, new boolean[V]));
    }
}
