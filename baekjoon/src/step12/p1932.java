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
		for (int i = 1; i < n; i++) {// 1 2 3 4��° ��
			for (int j = 0; j <= i; j++) {// �ڸ�
				if (j == 0) {// 0�ڸ��� �ٷ� ���ڸ��� ������
					dp[i][j] += dp[i - 1][0];
				} else if (j == i) {// ������ �»� ������
					dp[i][j] += dp[i - 1][j - 1];
				} else {// �׷��� ������, �»�� �� �� ū ���� ������
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
