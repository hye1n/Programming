package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p3055 {
	static char[][] map;
	static int[][] water;
	static int[][] dist;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int n, m;
	static Pair start;
	static Queue<Pair> queue = new LinkedList<Pair>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);

		map = new char[n][m];
		water = new int[n][m];
		dist = new int[n][m];
		int destX = 0, destY = 0;
		for (int i = 0; i < n; i++) {
			Arrays.fill(water[i], -1);
			Arrays.fill(dist[i], -1);
		}
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = line.charAt(j);
				if (map[i][j] == 'S') {
					start = new Pair(i, j);
					dist[i][j] = 0;
				} else if (map[i][j] == 'D') {
					destX = i;
					destY = j;
				} else if (map[i][j] == '*') {
					queue.add(new Pair(i, j));
					water[i][j] = 0;
				}
			}
		}
		water();
		move();
		System.out.println(dist[destX][destY] == -1 ? "KAKTUS" : dist[destX][destY]);
	}

	public static void move() {
		queue.add(new Pair(start.x, start.y));
		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			int x = p.x;
			int y = p.y;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
					continue;
				}
				if (dist[nx][ny] != -1) {
					continue;
				}
				if (map[nx][ny] == 'X') {
					continue;
				}
				if (water[nx][ny] != -1 && dist[x][y] + 1 >= water[nx][ny]) {
					continue;
				}
				dist[nx][ny] = dist[x][y] + 1;
				queue.add(new Pair(nx, ny));
			}
		}
	}

	public static void water() {
		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			int x = p.x;
			int y = p.y;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
					continue;
				}
				if (water[nx][ny] != -1) {
					continue;
				}
				if (map[nx][ny] == 'X' || map[nx][ny] == 'D') {
					continue;
				}
				water[nx][ny] = water[x][y] + 1;// 물이 차는 시간 증가
				queue.add(new Pair(nx, ny));
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
