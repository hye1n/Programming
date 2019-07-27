package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p6588 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				break;
			}
			boolean ispossible = false;
			for (int i = 2; i < num; i++) {
				if (isPrime(i) && isPrime(num - i)) {
					bw.append(num + " = " + i + " + " + (num - i) + "\n");
					ispossible = true;
					break;
				}
				ispossible = false;
			}
			if (!ispossible) {
				bw.append("Goldbach's conjecture is wrong.\n");
			}
		}
		bw.flush();
		bw.close();

	}

	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		int root = (int) Math.sqrt(num);
		if (root == 1) {
			return true;
		}
		for (int i = 2; i <= root; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
