package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2748 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 동적계획법을 이용한 피보나치
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		long[] fibonacci = new long[91];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int i = 2; i <= n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		bw.append(fibonacci[n] + "\n");
		bw.flush();
		bw.close();
	}
}
