package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15990 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		long[][] dp = new long[100001][4];
		long mod = 1000000009L;

		dp[1][1] = dp[2][2] = 1;
		dp[3][1] = dp[3][2] = dp[3][3] = 1;
		for (int i = 4; i <= 100000; i++) {
			dp[i][1] = dp[i - 1][2] + dp[i - 1][3];
			dp[i][2] = dp[i - 2][1] + dp[i - 2][3];
			dp[i][3] = dp[i - 3][1] + dp[i - 3][2];
			dp[i][1] %= mod;
			dp[i][2] %= mod;
			dp[i][3] %= mod;
		}
		while (tc-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sb.append((dp[n][1] + dp[n][2] + dp[n][3]) % mod + "\n");
		}
		System.out.println(sb);
	}

}
