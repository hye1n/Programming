package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1904 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int[] memo = new int[n + 1];
		memo[0] = 0;// N이 0일때 0가지
		memo[1] = 1;// N이 1일때 1가지
		memo[2] = 2;// N이 2일때 2가지
		for (int i = 3; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
			memo[i] %= 15746;
		}
		bw.append(String.valueOf(memo[n]));
		bw.flush();
		bw.close();

	}
}
