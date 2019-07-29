package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p9095 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine().trim());
		int[] dp = new int[12];
		dp[0] = dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= 11; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		for (int i = 0; i < tc; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			bw.append(dp[num] + "\n");
		}
		bw.flush();
		bw.close();

	}

}
