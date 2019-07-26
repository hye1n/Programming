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
		// dp[i]�� i��° ����� ������ �ִ� ����
		dp[1] = step[1];
		dp[2] = step[1] + step[2];
		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i - 2] + step[i], dp[i - 3] + step[i - 1] + step[i]);
			// 1�� �����϶�, i-1��° ����� ������ �ȵ� => i-2��° ����� �ݵ�� ��Ҿ����
			// ==> dp[i-2]+step[i];
			// 2�� �����϶�, i-1��° ����� ���, i-2��° ����� ������ �ȵ�
			// => i-3��° ����� �ݵ�� ��Ҿ�� �Ѵ�. ==> dp[i-3]+step[i-1]+step[i];
		}
		bw.append(String.valueOf(dp[n]));
		bw.flush();
		bw.close();
	}

}
