package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p15654 {
	static int[] result = new int[10];
	static StringBuilder sb = new StringBuilder();
	static boolean[] used = new boolean[10];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int[] arr = new int[n];
		int m = Integer.parseInt(input[1]);
		input = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(arr);
		solve(0, arr, n, m);
		System.out.println(sb);
	}

	public static void solve(int idx, int[] arr, int n, int m) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < n; i++) {
			if (used[i]) {
				continue;
			}
			used[i] = true;
			result[idx] = arr[i];
			solve(idx + 1, arr, n, m);
			used[i] = false;
		}
	}

}
