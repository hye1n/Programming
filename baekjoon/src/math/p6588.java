package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p6588 {
	public static final int MAX = 1000000;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean[] check = new boolean[MAX + 1];
		check[0] = check[1] = true;
		for (int i = 2; i * i <= MAX; i++) {
			if (check[i] == true) {
				continue;
			}
			for (int j = i + i; j <= MAX; j += i) {
				check[j] = true;
			}
		}
		while (true) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				break;
			}
			boolean isPossible = false;
			for (int i = 2; i < num; i++) {
				if (!check[i] && !check[num - i]) {
					bw.append(num + " = " + i + " + " + (num - i) + "\n");
					isPossible = true;
					break;
				}
			}
			if (!isPossible) {
				bw.append("Goldbach's conjecture is wrong.\n");
			}
		}
		bw.flush();
		bw.close();

	}

}
