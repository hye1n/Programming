package again;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p_9020 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tc; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			bw.write(solve(num) + "\n");
		}
		bw.flush();
		bw.close();
	}

	public static String solve(int num) {
		int front = 1, back = 1;
		for (int i = num / 2; i > 0; i--) {
			front = i;
			back = num - i;
			if (isPrimeNumber(i) && isPrimeNumber(num - i)) {
				return front + " " + back;
			}
		}
		return front + " " + back;
	}

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		int rootNumber = (int) Math.sqrt(num);
		for (int i = 2; i <= rootNumber; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
