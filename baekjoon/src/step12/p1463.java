package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1463 {

	// n을 1로 만드는 연산 사용횟수의 최솟값 출력
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		// dp[n] = n을 1로 만들때 연산을 사용하는 횟수의 최솟값
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 0;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + 1; // 1을 빼는 방법
			if (i % 3 == 0) {
				int temp = dp[i / 3] + 1;// 3으로 나누어 떨어질떄 3으로 나누는 방법
				if (dp[i] > temp) {
					dp[i] = temp;
				}
			}
			if (i % 2 == 0) {
				int temp = dp[i / 2] + 1;// 2로 나누어 떨이질때 2로 나누는 방법
				if (dp[i] > temp) {
					dp[i] = temp;
				}
			}
		}
		bw.append(String.valueOf(dp[n]));
		bw.flush();
		bw.close();

	}

}
