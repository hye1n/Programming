package again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1978 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int count = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num == 1) {
				continue;
			}
			int rootNumber = (int) Math.sqrt(num);
			boolean isPrimeNum = true;
			for (int r = 2; r <= rootNumber; r++) {
				if (num % r == 0) {
					isPrimeNum = false;
					break;
				}
			}
			if (isPrimeNum) {
				count++;
			}
		}
		System.out.println(count);

	}

}
