package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11723 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());// 연산 수
		int s = 0; // 공집합
		for (int i = 0; i < m; i++) {
			String[] input = br.readLine().split(" ");
			if (input[0].equals("add")) {
				int x = Integer.parseInt(input[1]) - 1;
				s = s | (1 << x);
			} else if (input[0].equals("remove")) {
				int x = Integer.parseInt(input[1]) - 1;
				s = s & ~(1 << x);
			} else if (input[0].equals("check")) {
				int x = Integer.parseInt(input[1]) - 1;
				int result = (s & (1 << x));
				if (result == 0) {
					bw.append("0\n");
				} else {
					bw.append("1\n");
				}
			} else if (input[0].equals("toggle")) {
				int x = Integer.parseInt(input[1]) - 1;
				s = s ^ (1 << x);
			} else if (input[0].equals("all")) {
				s = (1 << 20) - 1;
			} else if (input[0].equals("empty")) {
				s = 0;
			}

		}
		bw.flush();
		bw.close();
	}

}
