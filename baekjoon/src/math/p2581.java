package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2581 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int m = Integer.parseInt(br.readLine().trim());
		int n = Integer.parseInt(br.readLine().trim());
		boolean[] check = new boolean[n + 1];
		check[0] = check[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (check[i] == true) {
				continue;
			}
			for (int j = i + i; j <= n; j += i) {
				check[j] = true;
			}
		}
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = m; i <= n; i++) {
			if (check[i] == false) {
				sum += i;
				min = min > i ? i : min;
			}
		}
		String answer = (sum == 0) ? String.valueOf(-1) : sum + "\n" + min;
		bw.append(answer);
		bw.flush();
		bw.close();
	}

}
