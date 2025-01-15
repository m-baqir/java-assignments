
/*Write a Java program to create a simple directed graph, G = (V, E), where V is a set of vertices
and E = {{x, y} | x, y ∈ V and x ̸= y}, a set of edges. Use adjacency matrix to implement and
represent your graph. Then implement Dijkstra’s shortest path algorithm on the generated graph.
Your program should print all the distances from a source vertex (s) and the paths to all the vertices
u ∈ V */

public class MyGraph {
    private int[][] adjMatrix;
    private int vertices;

    /**
     * Constructs a MyGraph object with the specified number of vertices.
     *
     * @param vertices the number of vertices in the graph
     */
    public MyGraph(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    /**
     * Adds an edge between two vertices with the specified weight.
     *
     * @param i      the first vertex
     * @param j      the second vertex
     * @param weight the weight of the edge
     */
    public void addEdge(int i, int j, int weight) {
        adjMatrix[i][j] = weight;
        adjMatrix[j][i] = weight;
    }

    /**
     * Applies Dijkstra's algorithm to find the shortest path from the source vertex
     * to all other vertices.
     *
     * @param sourceVertex the source vertex
     */
    public void dijkstra(int sourceVertex) {
        boolean[] visited = new boolean[vertices];
        int[] distance = new int[vertices];
        int[] previous = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            distance[i] = Integer.MAX_VALUE; // Set initial distance to max
            previous[i] = -1; // Set initial predecessor to -1
        }

        distance[sourceVertex] = 0; // Set distance of source vertex to 0
        for (int i = 0; i < vertices - 1; i++) {
            int minVertex = findMinVertex(distance, visited); // Find the vertex with minimum distance
            visited[minVertex] = true; // Mark the vertex as visited
            for (int j = 0; j < vertices; j++) {
                if (adjMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
                    int newValue = distance[minVertex] + adjMatrix[minVertex][j]; // Calculate new distance
                    if (newValue < distance[j]) { // If new distance is smaller than current distance
                        distance[j] = newValue; // Update distance
                        previous[j] = minVertex; // Update previous
                    }
                }
            }
        }

        printDijkstra(distance, sourceVertex, previous); // Print the result of Dijkstra's algorithm
    }

    /**
     * Finds the vertex with the minimum distance among the unvisited vertices.
     *
     * @param distance the array of distances from the source vertex
     * @param visited  the array indicating whether a vertex has been visited or not
     * @return the index of the vertex with the minimum distance
     */
    private int findMinVertex(int[] distance, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }

    /**
     * Prints the result of Dijkstra's algorithm.
     *
     * @param distance     the array of distances from the source vertex
     * @param sourceVertex the source vertex
     * @param previous     the array of predecessors for each vertex
     */
    private void printDijkstra(int[] distance, int sourceVertex, int[] previous) {
        System.out.println("\nBased on the diagram in the assignment:\ns=0, a=1, b=2, c=3, d=4");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Dijkstra Algorithm: (Source Vertex: " + sourceVertex + ")");
        for (int i = 0; i < vertices; i++) {
            if (i != sourceVertex) {
                System.out.print("Vertex " + i + " distance = " + distance[i]);
                System.out.print(". Path: " + i);
                int j = previous[i];
                while (j != -1) {
                    System.out.print(" <- " + j);
                    j = previous[j];
                }
                System.out.println();
            }
        }
    }
}