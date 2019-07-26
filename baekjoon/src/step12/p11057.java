package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11057 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int[][] dp = new int[n + 1][10];
		for (int i = 0; i <= 9; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = j; k <= 9; k++) {
					dp[i][j] += dp[i - 1][k];
					dp[i][j] %= 10007;
				}
			}
		}
		long ans = 0;
		for (int i = 0; i <= 9; i++) {
			ans += dp[n][i];
		}
		ans %= 10007;
		bw.append(String.valueOf(ans));
		bw.flush();
		bw.close();
	}

}
