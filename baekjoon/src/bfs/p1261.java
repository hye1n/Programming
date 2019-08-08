package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p1261 {
	static int[][] map;
	static int[][] dist;
	static int n, m;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		m = Integer.parseInt(input[0]);
		n = Integer.parseInt(input[1]);
		map = new int[n][m];
		dist = new int[n][m];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dist[i], -1);
		}

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}

		bfs();
	}

	public static void bfs() {
		Queue<Pair> queue = new LinkedList<Pair>();// 0->0
		Queue<Pair> queue2 = new LinkedList<Pair>();// 0->1

		dist[0][0] = 0;
		queue.add(new Pair(0, 0));

		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			int x = p.x;
			int y = p.y;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (dist[nx][ny] == -1) {
						if (map[nx][ny] == 0) {
							dist[nx][ny] = dist[x][y];
							queue.add(new Pair(nx, ny));
						} else {
							dist[nx][ny] = dist[x][y] + 1;
							queue2.add(new Pair(nx, ny));
						}
					}

				}
			}
			if (queue.isEmpty()) {
				queue = queue2;
				queue2 = new LinkedList<Pair>();
			}
		}

		System.out.println(dist[n - 1][m - 1]);

	}

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
