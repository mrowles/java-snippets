package dataStructures.graph;

import java.util.Stack;

public class Graph {
    private final int vertices;
    private int edges;
    private Bag<Integer>[] adjacent;

    public Graph(int vertices) {
        if (vertices < 0) {
            throw new IllegalArgumentException("Number of vertices must be nonnegative");
        }

        this.vertices = vertices;
        this.edges = 0;

        adjacent = (Bag<Integer>[]) new Bag[vertices];

        for (int vertex = 0; vertex < vertices; vertex++) {
            adjacent[vertex] = new Bag<Integer>();
        }
    }

    public Graph(Graph graph) {
        this(graph.vertices());
        this.edges = graph.edges();

        for (int vertex = 0; vertex < graph.vertices; vertex++) {
            Stack<Integer> reverse = new Stack<Integer>();

            for (int otherVertex : graph.adjacent[vertex]) {
                reverse.push(otherVertex);
            }

            for (int otherVertex : reverse) {
                adjacent[vertex].add(otherVertex);
            }
        }
    }

    public int vertices() {
        return this.vertices;
    }

    public int edges() {
        return this.edges;
    }

    private void validateVertex(int vertex) {
        if (vertex < 0 || vertex >= this.vertices) {
            throw new IllegalArgumentException("vertex " + vertex + "is not between 0 and " + (vertices - 1));
        }
    }

    public void addEdge(int vertex, int otherVertex) {
        validateVertex(vertex);
        validateVertex(otherVertex);

        edges++;

        adjacent[vertex].add(otherVertex);
        adjacent[otherVertex].add(vertex);
    }

    public Iterable<Integer> adjacent(int vertex) {
        validateVertex(vertex);
        return adjacent[vertex];
    }

    public int degree(int vertex) {
        validateVertex(vertex);
        return adjacent[vertex].size();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vertices + " vertices, " + edges + " edges");
        stringBuilder.append(" = ");

        for (int vertex = 0; vertex < vertices; vertex++) {
            stringBuilder.append(vertex + ": ");
            for (int otherVertex : adjacent[vertex]) {
                stringBuilder.append(otherVertex + ", ");
            }
            stringBuilder.append(" | ");
        }

        return stringBuilder.toString();
    }
}
