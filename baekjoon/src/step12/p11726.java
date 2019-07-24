package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11726 {

	static int[] dp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 2*n 타일을 1*2타일과 2*1타일로 채우는 방법의 수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		dp = new int[n + 1];
		bw.append(String.valueOf(solve2(n)));
		bw.flush();
		bw.close();
	}

	// top-down 방식
	public static int solve(int n) {
		if (n < 2) {
			return 1;
		} else {
			if (dp[n] > 0) {
				return dp[n];
			}
			dp[n] = solve(n - 1) + solve(n - 2);
			dp[n] %= 10007;
			return dp[n];
		}
	}

	// bottom-up 방식
	public static int solve2(int n) {
		dp[0] = dp[1] = 1;
		if (n < 2) {
			return 1;
		}
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
			dp[i] %= 10007;
		}
		return dp[n];
	}

}
