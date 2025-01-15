import java.util.*;

class ShortestPath {
    static final int NO_PARENT = -1;

    private static void printSolution(int[] dist, int n, int[] parent) {
        int src = 0;
        System.out.println("Vertex\t Distance\tPath");
        for (int i = 0; i < n; i++) {
            System.out.print("\n" + src + " -> " + i + " \t\t " + dist[i] + "\t\t");
            printPath(parent, i);
        }
    }

    private static void printPath(int[] parent, int j) {
        if (parent[j] == NO_PARENT)
            return;
        printPath(parent, parent[j]);
        System.out.print(j + " ");
    }

    private static void dijkstra(int[][] adjacencyMatrix, int startVertex) {
        int nVertices = adjacencyMatrix[0].length;
        int[] shortestDistances = new int[nVertices];
        boolean[] added = new boolean[nVertices];
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            added[vertexIndex] = false;
        }
        shortestDistances[startVertex] = 0;
        int[] parents = new int[nVertices];
        parents[startVertex] = NO_PARENT;
        for (int i = 1; i < nVertices; i++) {
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }
            added[nearestVertex] = true;
            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];
                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                }
            }
        }
        printSolution(shortestDistances, nVertices, parents);
    }

    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
                // s a b c d
                { 0, 4, 2, 0, 0 }, // s
                { 0, 0, 3, 2, 0 }, // a
                { 0, 0, 0, 3, 5 }, // b
                { 0, 0, 3, 4, 1 }, // c
                { 0, 0, 0, 0, 0 } // d
        };

        dijkstra(adjacencyMatrix, 0);
    }
}
/*
 * int[][] adjacencyMatrix = {
 * // s a b c d
 * { 0, 4, 2, 0, 0 }, // s
 * { 0, 0, 3, 2, 3 }, // a
 * { 0, 1, 0, 4, 5 }, // b
 * { 0, 0, 0, 0, 0 }, // c
 * { 0, 0, 0, 1, 0 } // d
 * };
 */