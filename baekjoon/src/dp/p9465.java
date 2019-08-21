package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p9465 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while (tc-- > 0) {
			int n = Integer.parseInt(br.readLine());
			long[][] board = new long[2][n + 1];
			{
				st = new StringTokenizer(br.readLine());
				for (int i = 1; i <= n; i++) {
					board[0][i] = Long.valueOf(st.nextToken());
				}
			}
			{
				st = new StringTokenizer(br.readLine());
				for (int i = 1; i <= n; i++) {
					board[1][i] = Long.valueOf(st.nextToken());
				}
			}
			long[][] dp = new long[n + 1][3];// n:¿­¹øÈ£, 0:(x,x), 1:(o,x), 2:(x,o)
			for (int i = 1; i <= n; i++) {
				dp[i][0] = Math.max(Math.max(dp[i - 1][0], dp[i - 1][1]), dp[i - 1][2]);
				dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + board[0][i];
				dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + board[1][i];
			}
			long ans = Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]);
			System.out.println(ans);
		}
	}

}
