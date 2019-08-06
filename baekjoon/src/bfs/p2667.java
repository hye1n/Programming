package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p2667 {
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = input.charAt(j) - '0';
			}
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					bfs(i, j, ++cnt, n);
				}
			}
		}
		int[] ans = new int[cnt];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] != 0) {
					ans[map[i][j] - 1]++;
				}
			}
		}
		System.out.println(cnt);
		Arrays.sort(ans);
		for (int i : ans) {
			System.out.println(i);
		}
	}

	public static void bfs(int x, int y, int cnt, int n) {
		Queue<Pair> queue = new LinkedList<Pair>();
		visited[x][y] = true;
		map[x][y] = cnt;
		queue.add(new Pair(x, y));
		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			x = p.x;
			y = p.y;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
					if (map[nx][ny] == 1 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						map[nx][ny] = cnt;
						queue.add(new Pair(nx, ny));
					}
				}
			}
		}
	}

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}