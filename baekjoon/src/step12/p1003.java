package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tc; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			bw.append(callZeroCnt(num) + " " + callZeroCnt(num + 1) + "\n");
			// f(1) 호출횟수는 num+1의 f(0)호출횟수와 같다.
		}
		bw.flush();
		bw.close();
	}

	public static int callZeroCnt(int num) {
		// f(0) 호출횟수 반환
		if (num < 1) {
			return 1;
		}
		int a = 1, b = 0, sum = 1;
		for (int i = 1; i <= num; i++) {
			a = b;
			b = sum;
			sum = a + b;

		}
		return a;

	}
}
