package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p14226 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] time = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(time[i], -1);
		}

		Queue<Pair> queue = new LinkedList<Pair>();
		queue.add(new Pair(1, 0));// 현재 화면에 이모티콘1개, 클립보드엔 0개
		time[1][0] = 0;// 화면에 1개, 클립보드에 0개있을때의 시간 저장

		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			int s = p.screen;
			int c = p.clipboard;
			if (time[s][s] == -1) {// 화면에 있는걸 모두 클립보드에 복사했을 경우
				time[s][s] = time[s][c] + 1;
				queue.add(new Pair(s, s));
			}
			if (s + c <= n && time[s + c][c] == -1) {// 클립보드에 있는걸 화면에 붙여넣기한 경우
				time[s + c][c] = time[s][c] + 1;
				queue.add(new Pair(s + c, c));
			}
			if (s - 1 >= 0 && time[s - 1][c] == -1) {// 화면에 있는 이모티콘 1개 삭제한 경우
				time[s - 1][c] = time[s][c] + 1;
				queue.add(new Pair(s - 1, c));
			}
		}
		int ans = -1;
		for (int i = 0; i <= n; i++) {
			if (time[n][i] != -1) {
				if (ans == -1 || ans > time[n][i]) {// n개 있을때 시간중 최소값 찾기
					ans = time[n][i];
				}
			}
		}
		System.out.println(ans);

	}

	static class Pair {
		int screen, clipboard;

		Pair(int screen, int clipboard) {
			this.screen = screen;
			this.clipboard = clipboard;
		}
	}
}
