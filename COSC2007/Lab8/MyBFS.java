import java.util.LinkedList;
import java.util.Queue;

public class MyBFS {

    private int[][] myMatrix;
    private int vertices;

    /**
     * Constructs a MyBFS object with the specified number of vertices.
     *
     * @param vertices the number of vertices in the graph
     */
    public MyBFS(int vertices) {
        this.vertices = vertices;
        myMatrix = new int[vertices][vertices];
    }

    /**
     * Adds an edge between the source and destination vertices with the specified
     * weight.
     *
     * @param source      the source vertex
     * @param destination the destination vertex
     * @param weight      the weight of the edge
     */
    public void addEdge(int source, int destination, int weight) {
        myMatrix[source][destination] = weight;
        myMatrix[destination][source] = weight;
    }

    /**
     * Performs BFS traversal starting from the specified sourceVertex.
     * Prints the traversal path.
     *
     * @param sourceVertex the starting vertex for BFS traversal
     */
    public void bfs(int sourceVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        System.out.println("Legend: a = 0, b = 1, c = 2, d = 3, e = 4, f = 5, g = 6, h = 7, i = 8");
        System.out.println("Breadth-First Search Traversal with a = 0 as the source:");
        // while queue is not empty
        while (!queue.isEmpty()) {
            // perform poll on queue and store in currentVertex
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            // for each vertex in the graph
            for (int i = 0; i < vertices; i++) {
                // if the vertex is not visited and there is an edge between currentVertex and
                // other vertex
                if (myMatrix[currentVertex][i] != 0 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }

    /**
     * The main method creates a graph, adds edges, and performs BFS traversal.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Creating a graph with 9 vertices
        MyBFS graph = new MyBFS(9);

        // Adding weighted undirected edges
        // a = 0, b = 1, c = 2, d = 3, e = 4, f = 5, g = 6, h = 7, i = 8
        // a->b
        graph.addEdge(0, 1, 6);
        // a->f
        graph.addEdge(0, 5, 4);
        // b->c
        graph.addEdge(1, 2, 7);
        // b->e
        graph.addEdge(1, 4, 9);
        // c->d
        graph.addEdge(2, 3, 4);
        // c->e
        graph.addEdge(2, 4, 3);
        // e->g
        graph.addEdge(4, 6, 8);
        // f->g
        graph.addEdge(5, 6, 2);
        // g->d
        graph.addEdge(6, 3, 5);
        // h->d
        graph.addEdge(7, 3, 1);
        // i->a
        graph.addEdge(8, 0, 2);

        // Starting BFS traversal from vertex 0
        graph.bfs(0);
        System.out.println("Mohammad Baqir");
    }
}
