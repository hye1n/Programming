package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class p1759 {

	public static ArrayList<String> str = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]); // 암호길이
		int c = Integer.parseInt(input[1]);// 전체 알파벳 개수
		String[] alpha = br.readLine().split(" ");
		Arrays.sort(alpha);
		makePassword(n, alpha, "", 0);
		for (int i = 0; i < str.size(); i++) {
			bw.append(str.get(i) + "\n");
		}
		bw.flush();
		bw.close();
	}

	public static void makePassword(int n, String[] alpha, String password, int i) {
		if (password.length() == n) {
			if (check(password)) {
				str.add(password);
			}
			return;
		}
		if (i >= alpha.length) {// 이걸 먼저 수행하면 password.length가 4여도 그냥 return됨
			return;
		}
		makePassword(n, alpha, password + alpha[i], i + 1);// 지금 단어 사용
		makePassword(n, alpha, password, i + 1);// 지금 단어 사용 안함

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
		if (consonant >= 1 && vowel >= 2) {
			return true;
		} else {
			return false;
		}
	}

}
