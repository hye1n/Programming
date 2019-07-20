package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3009 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine().trim());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine().trim());
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		int dx = 0, dy = 0;
		if (x1 == x2) {
			dx = x3;
		} else if (x1 == x3) {
			dx = x2;
		} else if (x2 == x3) {
			dx = x1;
		}
		if (y1 == y2) {
			dy = y3;
		} else if (y1 == y3) {
			dy = y2;
		} else if (y2 == y3) {
			dy = y1;
		}

		System.out.println(dx + " " + dy);
	}

}
