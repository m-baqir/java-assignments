public class Main {
    public static void main(String[] args) {
        // Create a new graph
        MyGraph graph = new MyGraph(5);
        // Add edges and vertices to the graph
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 4, 3);
        graph.addEdge(2, 1, 1);
        graph.addEdge(2, 3, 4);
        graph.addEdge(2, 4, 5);
        graph.addEdge(4, 3, 1);
        // Apply Dijkstra's algorithm to the graph with source vertex 0=s
        graph.dijkstra(0);
    }
}
