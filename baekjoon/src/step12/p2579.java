package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2579 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int[] step = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			step[i] = Integer.parseInt(br.readLine().trim());
		}
		int[] dp = new int[n + 1];
		// dp[i]는 i번째 계단을 갔을때 최대 점수
		dp[1] = step[1];
		dp[2] = step[1] + step[2];
		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i - 2] + step[i], dp[i - 3] + step[i - 1] + step[i]);
			// 1개 연속일때, i-1번째 계단은 밟으면 안됨 => i-2번째 계단은 반드시 밟았어야함
			// ==> dp[i-2]+step[i];
			// 2개 연속일때, i-1번째 계단을 밟고, i-2번째 계단은 밟으면 안됨
			// => i-3번째 계단은 반드시 밟았어야 한다. ==> dp[i-3]+step[i-1]+step[i];
		}
		bw.append(String.valueOf(dp[n]));
		bw.flush();
		bw.close();
	}

}
