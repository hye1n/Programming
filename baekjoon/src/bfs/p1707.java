package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1707 {
	static int[] color;
	static ArrayList<Integer>[] edges;
	static boolean check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while (tc-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
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

			color = new int[n + 1];
			check = true;
			for (int i = 1; i <= n; i++) {
				if (!check) {
					break;
				}
				if (color[i] == 0) {
					bfs(i);
				}
			}
			System.out.println(check ? "YES" : "NO");

		}

	}

	public static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		color[v] = 1;
		while (!queue.isEmpty()) {
			v = queue.poll();
			for (int i : edges[v]) {
				if (color[i] == color[v]) {
					check = false;
					return;
				}
				if (color[i] == 0) {
					color[i] = color[v] * -1;
					queue.add(i);
				}
			}
		}
	}
}
