package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14002 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		int[] v = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(input[i - 1]);
		}

		for (int i = 1; i <= n; i++) {
			dp[i] = 1;
			for (int j = i - 1; j > 0; j--) {
				if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
					v[i] = j;
				}
			}
		}
		int max = 0;
		int p = 0;
		for (int i = 1; i <= n; i++) {
			if (max < dp[i]) {
				max = dp[i];
				p = i;
			}
		}
		System.out.println(max);
		go(p, arr, v);
		
	}

	public static void go(int p, int[] arr, int[] v) {
		if (p == 0) {
			return;
		}
		go(v[p], arr, v);
		System.out.print(arr[p] + " ");
	}

}
