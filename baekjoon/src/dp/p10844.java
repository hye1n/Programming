package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10844 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] dp = new long[n + 1][10];
		long mod = 1000000000L;
		for (int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j == 0) {
					dp[i][j] += dp[i - 1][j + 1];
				} else if (j == 9) {
					dp[i][j] += dp[i - 1][j - 1];
				} else {
					dp[i][j] += dp[i - 1][j - 1] + dp[i - 1][j + 1];
				}
				dp[i][j] %= mod;
			}
		}
		long ans = 0;
		for (int i = 0; i <= 9; i++) {
			ans += dp[n][i];
		}
		System.out.println(ans % mod);
	}

}
