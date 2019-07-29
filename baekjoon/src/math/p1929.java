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
		for (int i = m; i <= n; i++) {
			if (check[i] == false) {
				bw.append(i + "\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
