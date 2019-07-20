package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4153 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine().trim());
			int len1 = Integer.parseInt(st.nextToken());
			int len2 = Integer.parseInt(st.nextToken());
			int len3 = Integer.parseInt(st.nextToken());
			if (len1 == 0 && len2 == 0 && len3 == 0) {
				break;
			}
			if (Math.pow(len1, 2) == Math.pow(len2, 2) + Math.pow(len3, 2)
					|| Math.pow(len2, 2) == Math.pow(len1, 2) + Math.pow(len3, 2)
					|| Math.pow(len3, 2) == Math.pow(len1, 2) + Math.pow(len2, 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}

	}

}
