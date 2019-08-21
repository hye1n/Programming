package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9095 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] dp = new int[12];
		dp[0] = dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= 11; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		int tc = Integer.parseInt(br.readLine());
		while (tc-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n] + "\n");
		}
		System.out.println(sb);
	}

}
