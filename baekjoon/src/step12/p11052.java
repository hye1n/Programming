package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		int[] cost = new int[n + 1];
		String[] input = br.readLine().split(" ");
		for (int i = 1; i <= n; i++) {
			cost[i] = Integer.parseInt(input[i - 1]);
		}

		int[] dp = new int[n + 1];
		// dp[i]�� i�� ī�带 �춧, �����ؾ��ϴ� �ִ�
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				// i==2, j==1-> ����¥���ִ밪 + ���尡�� : dp[2-1]+cost[1]
				// i==2, j==2-> 2��¥�� ���� : dp[2-2]+cost[2]
				dp[i] = Math.max(dp[i], dp[i - j] + cost[j]);
			}
		}
		bw.append(String.valueOf(dp[n]));
		bw.flush();
		bw.close();

	}

}
