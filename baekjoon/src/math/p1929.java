package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int m = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		for (int i = m; i <= n; i++) {
			if (i == 1) {
				continue;
			}
			int root = (int) Math.sqrt(i);
			boolean isPrime = true;
			for (int r = 2; r <= root; r++) {
				if (i % r == 0) {
					isPrime = false;
					break;
				}
				isPrime = true;
			}
			if (isPrime) {
				bw.append(i + "\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
