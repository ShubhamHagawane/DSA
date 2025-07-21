

import java.util.*;

public class S400780381 {

    static final int N = 6;

    static Map<Integer, String> indexToLandmark = Map.of(
        0, "Main Gate",
        1, "Library",
        2, "Cafeteria",
        3, "Hostel",
        4, "Auditorium",
        5, "Sports Complex"
    );

    public static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        System.out.print(indexToLandmark.get(node) + " ");
        List<Integer> neighbors = graph.get(node);
        for (int i = 0; i < neighbors.size(); i++) {
            int neighbor = neighbors.get(i);
            if(!visited[neighbor]){
                dfs(neighbor, graph, visited);
            }
        }
    }

    public static void bfs(int start, List<List<Integer>> graph) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(indexToLandmark.get(node) + " ");
            List<Integer> neighbors = graph.get(node);
            for (int i = 0; i < neighbors.size(); i++) {
                int neighbor = neighbors.get(i);
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }

        }
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = List.of(
            List.of(1, 2),       // Main Gate
            List.of(0, 3, 4),    // Library
            List.of(0, 3, 5),    // Cafeteria
            List.of(1, 2, 5),    // Hostel
            List.of(1, 5),       // Auditorium
            List.of(2, 3, 4)     // Sports Complex
        );

        System.out.println("DFS Traversal starting from Main Gate:");
        boolean[] visitedDfs = new boolean[N];
        dfs(0, graph, visitedDfs);

        System.out.println("\n\nBFS Traversal starting from Main Gate:");
        bfs(0, graph);
    }
}
