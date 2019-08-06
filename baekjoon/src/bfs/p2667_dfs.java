package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2667_dfs {
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
					dfs(i, j, ++cnt, n);
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

	public static void dfs(int x, int y, int cnt, int n) {
		visited[x][y] = true;
		map[x][y] = cnt;
		for (int k = 0; k < 4; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];
			if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
				if (map[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx, ny, cnt, n);
				}
			}
		}
	}
}