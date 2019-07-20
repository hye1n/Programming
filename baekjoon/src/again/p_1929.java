package again;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p_1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		for (int i = m; i <= n; i++) {
			if (isPrimeNumber(i)) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();

	}

	public static boolean isPrimeNumber(int num) {
		if (num == 1) {
			return false;
		}
		int rootNum = (int) Math.sqrt(num);
		for (int r = 2; r <= rootNum; r++) {
			if (num % r == 0) {
				return false;
			}
		}
		return true;
	}

}
