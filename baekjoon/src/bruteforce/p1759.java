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
		int n = Integer.parseInt(input[0]); // ��ȣ����
		int c = Integer.parseInt(input[1]);// ��ü ���ĺ� ����
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
		if (i >= alpha.length) {// �̰� ���� �����ϸ� password.length�� 4���� �׳� return��
			return;
		}
		makePassword(n, alpha, password + alpha[i], i + 1);// ���� �ܾ� ���
		makePassword(n, alpha, password, i + 1);// ���� �ܾ� ��� ����

	}

	public static boolean check(String password) {
		int consonant = 0;// ����
		int vowel = 0;// ����
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
