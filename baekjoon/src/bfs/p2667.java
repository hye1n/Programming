package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p2667 {
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] map = new int[n][n];
		boolean[][] visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j] && map[i][j] == 1) {
					bfs(visited, map, i, j, ++cnt, n);
				}
			}
		}
		int[] ans = new int[cnt];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] != 0) {
					ans[map[i][j] - 1] += 1;
				}
			}
		}
		System.out.println(cnt);
		Arrays.sort(ans);
		for (int i : ans) {
			System.out.println(i);
		}
	}

	public static void bfs(boolean[][] visited, int[][] map, int x, int y, int cnt, int n) {
		Queue<Pair> queue = new LinkedList<Pair>();
		visited[x][y] = true;
		queue.add(new Pair(x, y));
		map[x][y] = cnt;
		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			x = p.x;
			y = p.y;
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
					if (!visited[nx][ny] && map[nx][ny] == 1) {
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
