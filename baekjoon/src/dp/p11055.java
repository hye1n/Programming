package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11055 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			dp[i] = arr[i] = Integer.parseInt(input[i - 1]);
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (arr[j] < arr[i] && dp[i] < dp[j] + arr[i]) {
					dp[i] = dp[j] + arr[i];
				}
			}
		}
		int max = 0;
		for (int i = 1; i <= n; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);

	}

}
