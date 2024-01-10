import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    static class Edge {
        int src;
        int dest;
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        //Mull to Empty Conversion
        for(int i = 0; i<graph.length ; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    // Modified DFS
    public static void TopologicalSort(ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> stack) {
        vis[curr] = true;
        // Traverse Nerighbours
        for(int i = 0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                TopologicalSort(graph, vis, e.dest ,stack);
            }
        }
        stack.push(curr);
    }

    public static void GetElementFromStack(ArrayList<Edge> graph[], int V) {
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<V; i++) {
            if(!vis[i]) {
                TopologicalSort(graph,vis,i,stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        GetElementFromStack(graph,V);
    }
}
