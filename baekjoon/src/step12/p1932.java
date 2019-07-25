package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1932 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int[][] dp = new int[n][n];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			String input = br.readLine().trim();
			String[] temp = input.split(" ");
			for (int j = 0; j < temp.length; j++) {
				dp[i][j] = Integer.parseInt(temp[j]);
			}
		}
		for (int i = 1; i < n; i++) {// 1 2 3 4번째 수
			for (int j = 0; j <= i; j++) {// 자리
				if (j == 0) {// 0자리면 바로 윗자리만 더해줌
					dp[i][j] += dp[i - 1][0];
				} else if (j == i) {// 같으면 좌상만 더해줌
					dp[i][j] += dp[i - 1][j - 1];
				} else {// 그렇지 않을땐, 좌상과 상 중 큰 값을 더해줌
					dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
				}
				max = Math.max(max, dp[i][j]);
			}
		}
		bw.append(String.valueOf(max));
		bw.flush();
		bw.close();
	}

}
