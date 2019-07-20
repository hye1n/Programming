package addedProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for (int i = 1; i <= 9; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int num = Integer.parseInt(st.nextToken());
			if (num > max) {
				max = num;
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}

}
