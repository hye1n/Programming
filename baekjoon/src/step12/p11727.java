package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11727 {
	static int[] dp;

	// 2*n타일을 1*2, 2*1, 2*2 탕일로 채우는 방법의 수
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		dp = new int[n + 1];
		bw.append(String.valueOf(solve(n)));
		bw.flush();
		bw.close();
	}

	// top-down 방식
	public static int solve(int n) {
		if (n < 2) {
			return 1;
		} else if (n == 2) {
			return 3;
		} else {
			if (dp[n] > 0) {
				return dp[n];
			}
			dp[n] = solve(n - 1) + 2 * solve(n - 2);
			dp[n] %= 10007;
			return dp[n];
		}
	}

	// bottom-up방식
	public static int solve2(int n) {
		if (n < 2) {
			return n;
		}
		dp[0] = dp[1] = 1;
		dp[2] = 3;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + 2 * dp[i - 2];
			dp[i] %= 10007;
		}
		return dp[n];
	}

}
