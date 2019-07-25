package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p9461 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine().trim());
		long[] dp = new long[101];
		dp[1] = dp[2] = dp[3] = 1;
		for (int i = 4; i <= 100; i++) {
			dp[i] = dp[i - 3] + dp[i - 2];
		}
		for (int i = 0; i < tc; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			bw.append(dp[num] + "\n");
		}
		bw.flush();
		bw.close();
	}

}
