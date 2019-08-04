package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15650 {
	static StringBuilder sb = new StringBuilder();
	static int[] arr = new int[10];
	static boolean[] used = new boolean[10];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		solve(0, 1, n, m);
		System.out.println(sb);
	}

	public static void solve(int idx, int start, int n, int m) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i <= n; i++) {
			if (used[i]) {
				continue;
			}
			used[i] = true;
			arr[idx] = i;
			solve(idx + 1, i + 1, n, m);
			used[i] = false;
		}
	}
}
