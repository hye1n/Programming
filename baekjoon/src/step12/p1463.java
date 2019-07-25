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
		int[] dp = new int[n + 1];
		dp[0] = dp[1] = 0;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;// 1을 빼는 연산
			if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
				// 3으로 나누어 떨어지면, 3으로 나누는 연산(최솟값이기에 if문에서 대소 비교 후 값 넣기)
				dp[i] = dp[i / 3] + 1;
			}
			if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
				// 2로 나누어 떨어지면, 2로 나누는 연산(최솟값이기에 if문에서 대소 비교 후 값 넣기)
				dp[i] = dp[i / 2] + 1;
			}
		}
		bw.append(String.valueOf(dp[n]));
		bw.flush();
		bw.close();
	}

}
