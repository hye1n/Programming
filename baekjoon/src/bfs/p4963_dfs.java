package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4963_dfs {
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0, 1, 1, -1, -1 };
	static int[] dy = { 0, 0, -1, 1, 1, -1, -1, 1 };
	static int w, h;

	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			if (h == 0 && w == 0) {
				break;
			}
			map = new int[w][h];
			visited = new boolean[w][h];
			for (int i = 0; i < w; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < h; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int cnt = 0;
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					if (!visited[i][j] && map[i][j] == 1) {
						dfs(i, j);
						cnt += 1;
					}
				}
			}
			System.out.println(cnt);
		}

	}

	public static void dfs(int x, int y) {
		visited[x][y] = true;
		for (int k = 0; k < 8; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];
			if (nx >= 0 && ny >= 0 && nx < w && ny < h) {
				if (map[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx, ny);
				}
			}
		}
	}
}