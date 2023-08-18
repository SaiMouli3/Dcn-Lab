import java.util.*;

class Edge {
    int source, destination, weight;

    Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

class Main {
    private int V, E;
    private Edge[] edges;

    Main(int v, int e) {
        V = v;
        E = e;
        edges = new Edge[E];
    }

    void addEdge(int source, int destination, int weight, int index) {
        edges[index] = new Edge(source, destination, weight);
    }

    void shortestPath(int start) {
        int[] distances = new int[V];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[start] = 0;

        for (int i = 1; i < V; ++i) {
            for (Edge edge : edges) {
                int u = edge.source;
                int v = edge.destination;
                int weight = edge.weight;

                if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                }
            }
        }
        System.out.println("Shortest distances from node " + start);
        for (int i = 0; i < V; ++i) {
            System.out.println("To node " + i + ": Distance " + distances[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        int E = 7; // Number of edges
        Main graph = new Main(V, E);

        graph.addEdge(0, 1, 4, 0);
        graph.addEdge(0, 2, 2, 1);
        graph.addEdge(1, 2, 5, 2);
        graph.addEdge(1, 3, 10, 3);
        graph.addEdge(2, 3, 3, 4);
        graph.addEdge(3, 4, 7, 5);
        graph.addEdge(4, 0, -6, 6);

        int startNode = 0;
        graph.shortestPath(startNode);
    }
}
