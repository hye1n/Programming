package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4963_dfs {
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0, -1, 1, 1, -1 };
	static int[] dy = { 0, 0, -1, 1, 1, 1, -1, -1 };
	static int w;
	static int h;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			visited = new boolean[h][w];
			map = new int[h][w];
			if (w == 0 && h == 0) {
				break;
			}
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && !visited[i][j]) {
						dfs(i, j, ++cnt);
					}
				}
			}
			System.out.println(cnt);

		}
	}

	public static void dfs(int x, int y, int cnt) {
		visited[x][y] = true;
		for (int k = 0; k < 8; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];
			if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
				if (map[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx, ny, cnt);
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
