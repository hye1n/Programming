package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10250 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());

		int tc = Integer.parseInt(st.nextToken());
		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int floor = N % H;
			int room = N / H + 1;
			if (floor == 0) {
				floor = H;
				room--;
			}
//			System.out.printf(floor + "%02d\n", room);
			System.out.println(floor * 100 + room);

		}
	}

}
