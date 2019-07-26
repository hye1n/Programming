package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10844 {

	public static long mod = 1000000000L;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		int[][] dp = new int[n + 1][10];
		// dp[n][i]는 n자리수일때, 마지막숫자가 i인 계단수의 개수
		for (int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j - 1 >= 0) {
					dp[i][j] += dp[i - 1][j - 1];
				}
				if (j + 1 <= 9) {
					dp[i][j] += dp[i - 1][j + 1];
				}
				dp[i][j] %= mod;
			}
		}
		long ans = 0;
		for (int i = 0; i <= 9; i++) {
			ans += dp[n][i];
		}
		ans %= mod;
		bw.append(String.valueOf(ans));
		bw.flush();
		bw.close();

	}

}
