package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class p15663 {
	static int[] result = new int[10];
	static boolean[] used = new boolean[10];
	static LinkedHashSet<String> set = new LinkedHashSet<String>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		input = br.readLine().split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(arr);
		solve(0, arr, n, m);
		for (String s : set) {
			sb.append(s + "\n");
		}
		System.out.println(sb);

	}

	public static void solve(int idx, int[] arr, int n, int m) {
		if (idx == m) {
			String temp = "";
			for (int i = 0; i < m; i++) {
				temp += result[i] + " ";
			}
			set.add(temp);
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
