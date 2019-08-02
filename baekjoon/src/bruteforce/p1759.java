package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1759 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int c = Integer.parseInt(input[1]);
		input = br.readLine().split(" ");
		Arrays.sort(input);
		solve(n, input, 0, "");
	}

	public static void solve(int n, String[] arr, int i, String password) {
		if (password.length() == n) {
			if (check(password)) {
				System.out.println(password);
			}
			return;
		}
		if (i >= arr.length) {
			return;
		}
		solve(n, arr, i + 1, password + arr[i]);
		solve(n, arr, i + 1, password);
	}

	public static boolean check(String password) {
		int consonant = 0;// 모음
		int vowel = 0;// 자음
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) == 'a' || password.charAt(i) == 'e' || password.charAt(i) == 'i'
					|| password.charAt(i) == 'o' || password.charAt(i) == 'u') {
				consonant += 1;
			} else {
				vowel += 1;
			}
		}
		return consonant >= 1 && vowel >= 2;
	}

}
