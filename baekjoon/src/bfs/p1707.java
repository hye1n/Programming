package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class p1707 {
	static boolean isBipartite;

	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while (tc-- > 0) {
			String[] input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			ArrayList<Integer>[] edges = (ArrayList<Integer>[]) new ArrayList[n + 1];
			int[] color = new int[n + 1];// 0 :»ö¾øÀ½, 1:»¡°­,2:ÆÄ¶û
			for (int i = 1; i <= n; i++) {
				edges[i] = new ArrayList<Integer>();
			}
			for (int i = 0; i < m; i++) {
				input = br.readLine().split(" ");
				int u = Integer.parseInt(input[0]);
				int v = Integer.parseInt(input[1]);
				edges[u].add(v);
				edges[v].add(u);
			}
			isBipartite = true;
			for (int i = 1; i <= n; i++) {
				if (!isBipartite) {
					break;
				}
				if (color[i] == 0) {
					bfs(i, color, edges);
				}
			}
			System.out.println(isBipartite ? "YES" : "NO");
		}
	}

	public static void bfs(int i, int[] color, ArrayList<Integer>[] edges) {
		Queue<Integer> queue = new LinkedList<Integer>();
		color[i] = 1;
		queue.add(i);
		while (!queue.isEmpty()) {
			i = queue.poll();
			for (int j : edges[i]) {
				if (color[j] == 0) {
					color[j] = color[i] * -1;
					queue.add(j);
				} else if (color[i] == color[j]) {
					isBipartite = false;
					return;
				}
			}
		}
	}
}