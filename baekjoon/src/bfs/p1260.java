package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1260 {
	static ArrayList<Integer>[] edges;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());

		edges = (ArrayList<Integer>[]) new ArrayList[n + 1];
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

		for (int i = 1; i <= n; i++) {
			Collections.sort(edges[i]);// 정점번호가 작은것부터 방문하기 위해!
		}
		visited = new boolean[n + 1];
		dfs(start);
		sb.append("\n");
		visited = new boolean[n + 1];
		bfs(start);
		System.out.println(sb);

	}

	public static void dfs(int start) {
		if (visited[start]) {
			return;
		}
		visited[start] = true;
		sb.append(start + " ");
		for (int i : edges[start]) {
			if (!visited[i]) {
				dfs(i);
			}
		}
	}

	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visited[start] = true;
		while (!queue.isEmpty()) {
			int x = queue.poll();
			sb.append(x + " ");
			for (int i : edges[x]) {
				if (!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
