package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p2206 {
	static int[][][] dist;
	static int[][] map;
	static int n, m;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		map = new int[n][m];
		dist = new int[n][m][2];// z==0: 벽 안부숨, z==1: 벽 부숨

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}
		bfs();
	}

	public static void bfs() {
		Queue<Pair> queue = new LinkedList<Pair>();
		dist[0][0][0] = 1;
		queue.add(new Pair(0, 0, 0));

		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			int x = p.x;
			int y = p.y;
			int z = p.z;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (map[nx][ny] == 0 && dist[nx][ny][z] == 0) {
						// 0으로 갈 수있고, 아직 안갔을 경우엔 dist+1, 큐에 추가
						dist[nx][ny][z] = dist[x][y][z] + 1;
						queue.add(new Pair(nx, ny, z));
					}
					if (z == 0 && map[nx][ny] == 1 && dist[nx][ny][z + 1] == 0) {
						// 벽을 안부쉈고, 벽을 만났을때, 벽 부순상태로 안가봤을때
						dist[nx][ny][z + 1] = dist[x][y][z] + 1;
						queue.add(new Pair(nx, ny, z + 1));
					}
				}
			}
		}

		if (dist[n - 1][m - 1][0] != 0 && dist[n - 1][m - 1][1] != 0) {
			System.out.println(Math.min(dist[n - 1][m - 1][0], dist[n - 1][m - 1][1]));
		} else if (dist[n - 1][m - 1][0] != 0) {
			System.out.println(dist[n - 1][m - 1][0]);
		} else if (dist[n - 1][m - 1][1] != 0) {
			System.out.println(dist[n - 1][m - 1][1]);
		} else {
			System.out.println(-1);
		}
	}

	static class Pair {
		int x, y, z;

		Pair(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
}
