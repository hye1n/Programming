package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class p1261_deque {

	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int m = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };

		int[][] map = new int[n][m];
		int[][] dist = new int[n][m];
		ArrayDeque<Pair> deque = new ArrayDeque<Pair>();
		deque.add(new Pair(0, 0));

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = line.charAt(j) - '0';

			}
		}
		for (int i = 0; i < n; i++) {
			Arrays.fill(dist[i], -1);
		}

		dist[0][0] = 0;
		while (!deque.isEmpty()) {
			Pair p = deque.poll();
			int x = p.x;
			int y = p.y;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (map[nx][ny] == 0 && dist[nx][ny] == -1) {
						dist[nx][ny] = dist[x][y];
						deque.addFirst(new Pair(nx, ny));
					} else if (map[nx][ny] == 1 && dist[nx][ny] == -1) {
						dist[nx][ny] = dist[x][y] + 1;
						deque.addLast(new Pair(nx, ny));
					}
				}
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