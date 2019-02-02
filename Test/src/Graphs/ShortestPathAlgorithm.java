package Graphs;

public class ShortestPathAlgorithm {

	static int numberOfVertices = 9;

	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
				{ 4, 0, 8, 0, 0, 0, 0, 11, 0 }, { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
				{ 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
				{ 0, 0, 4, 14, 10, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
				{ 8, 11, 0, 0, 0, 0, 1, 0, 7 }, { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
		ShortestPathAlgorithm shortestPath = new ShortestPathAlgorithm();
		shortestPath.dijkstra(graph, 0);
	
	}

	private void dijkstra(int[][] graph, int source) {

		int[] dist = new int[numberOfVertices];
		Boolean[] sptSet = new Boolean[numberOfVertices];
		for (int iter = 0; iter < numberOfVertices; iter++) {
			dist[iter] = Integer.MAX_VALUE;
			sptSet[iter] = false;
		}

		dist[0] = 0;

		for (int iter = 0; iter < numberOfVertices - 1; iter++) {
			int u = minDistance(dist, sptSet);
			sptSet[u] = true;

			for (int jter = 0; jter < numberOfVertices; jter++) {
				if (!sptSet[jter] && graph[u][jter] != 0 && (dist[u] + graph[u][jter] < dist[jter])) {
					dist[jter] = dist[u] + graph[u][jter];
				}
			}
		}
		printSolution(dist, numberOfVertices);

	}

	void printSolution(int dist[], int n) {
		System.out.println("Vertex   Distance from Source");
		for (int i = 0; i < numberOfVertices; i++)
			System.out.println(i + " tt " + dist[i]);
	}

	private int minDistance(int[] dist, Boolean[] sptSet) {

		int minIndex = -1;

		int min = Integer.MAX_VALUE;

		for (int iter = 0; iter < numberOfVertices; iter++) {
			if (dist[iter] <= min && sptSet[iter] == false) {
				min = dist[iter];
				minIndex = iter;
			}

		}
		return minIndex;

	}
}
