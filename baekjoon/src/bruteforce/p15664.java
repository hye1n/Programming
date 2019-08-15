package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class p15664 {
	static int[] arr = new int[10];
	static LinkedHashSet<String> set = new LinkedHashSet<String>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		input = br.readLine().split(" ");
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(num);
		solve(0, num, n, m, 0);
		for (String s : set) {
			sb.append(s + "\n");
		}
		System.out.println(sb);
	}

	public static void solve(int idx, int[] num, int n, int m, int start) {
		if (idx == m) {
			String temp = "";
			for (int i = 0; i < m; i++) {
				temp += arr[i] + " ";
			}
			set.add(temp);
			return;
		}
		for (int i = start; i < n; i++) {
			arr[idx] = num[i];
			solve(idx + 1, num, n, m, i + 1);
		}

	}

}
