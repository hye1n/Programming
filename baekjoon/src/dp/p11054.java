package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11054 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		int[] dp2 = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(input[i - 1]);
		}
		for (int i = 1; i <= n; i++) {
			dp[i] = 1;
			for (int j = i - 1; j > 0; j--) {
				if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		for (int i = n; i >= 1; i--) {
			dp2[i] = 1;
			for (int j = i + 1; j <= n; j++) {
				if (arr[i] > arr[j] && dp2[i] < dp2[j] + 1) {
					dp2[i] = dp2[j] + 1;
				}
			}
		}
		int ans = dp[1] + dp2[1] - 1;
		for (int i = 1; i <= n; i++) {
			ans = Math.max(ans, dp[i] + dp2[i] - 1);
		}
		System.out.println(ans);
	}

}
