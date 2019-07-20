package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4948 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		while ((n = Integer.parseInt(br.readLine().trim())) != 0) {
			primeNumber(n);
		}
	}

	public static void primeNumber(int num) {
		int count = 0;
		int maxN = 2 * num;
		for (int i = (num + 1); i <= maxN; i++) {
			if (i == 1) {
				continue;
			}
			int rootNumber = (int) Math.sqrt(i);
			if (rootNumber == 1) {
				count++;
				continue;
			}
			boolean isPrime = false;
			for (int r = 2; r <= rootNumber; r++) {
				if (i % r == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
			if (isPrime) {
				count++;
			}
		}
		System.out.println(count);
	}

}
