package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p16194 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] dp = new int[n + 1];
		int[] p = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			p[i] = Integer.parseInt(st.nextToken());
			dp[i] = Integer.MAX_VALUE;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] = Math.min(dp[i - j] + p[j], dp[i]);
			}
		}
		System.out.println(dp[n]);

	}

}
