package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int ans = n;
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(input[i]);
			if (num == 1) {
				ans -= 1;
			}
			int root = (int) Math.sqrt(num);
			for (int r = 2; r <= root; r++) {
				if (num % r == 0) {
					ans -= 1;
					break;
				}
			}
		}
		bw.append(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
