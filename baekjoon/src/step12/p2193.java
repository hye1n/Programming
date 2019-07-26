package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		// 2차원 배열
//		long[][] dp = new long[n + 1][2];
//		dp[1][1] = 1;
//		for (int i = 2; i <= n; i++) {
//			dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
//			dp[i][1] = dp[i - 1][0];
//		}
//		bw.append(String.valueOf(dp[n][0] + dp[n][1]));
		// 1차원 배열
		long[] dp = new long[n + 1];
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		bw.append(String.valueOf(dp[n]));
		bw.flush();
		bw.close();
	}

}
