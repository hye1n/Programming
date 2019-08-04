package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p15655 {
	static StringBuilder sb = new StringBuilder();
	static int[] result = new int[10];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int[] arr = new int[n];
		input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(arr);
		solve(0, arr, 0, n, m);
		System.out.println(sb);
	}

	public static void solve(int idx, int[] arr, int start, int n, int m) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i < n; i++) {
			result[idx] = arr[i];
			solve(idx + 1, arr, i + 1, n, m);
		}
	}
}
