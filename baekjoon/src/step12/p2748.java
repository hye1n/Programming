package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2748 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 동적계획법을 이용한 피보나치
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		long[] dp = new long[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		bw.append(String.valueOf(dp[n]));
		bw.flush();
		bw.close();
	}

}
