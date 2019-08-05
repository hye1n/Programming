package bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p11724 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		ArrayList<Integer>[] edges = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			edges[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			edges[u].add(v);
			edges[v].add(u);
		}

		boolean[] visited = new boolean[n + 1];
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				count += 1;
				bfs(i, edges, visited);
			}
		}
		bw.append(String.valueOf(count));
		bw.flush();
		bw.close();
	}

	public static void bfs(int start, ArrayList<Integer>[] edges, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[start] = true;
		queue.add(start);
		while (!queue.isEmpty()) {
			int x = queue.poll();
			for (int i : edges[x]) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
