package again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2231 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 1; i < n; i++) {
			int length = String.valueOf(i).length();
			sum = i;
			for (int j = 0; j < length; j++) {
				sum += String.valueOf(i).charAt(j) - '0';
			}
			if (sum == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

}
