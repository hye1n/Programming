package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1002 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 두 원의 교점의 개수를 구하는 문제..와우~
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			solve(x1, y1, r1, x2, y2, r2);
		}
	}

	public static void solve(int x1, int y1, int r1, int x2, int y2, int r2) {
		/**
		 *  1. 두 원이 너무 멀 때 -  r > r1 + r2
		 *  2. 두 원이 한점에서 만남. (외접) - r = r1 + r2
		 *  3. 두 교점 - 나머지 조건
		 *  4. 두 원이 한점에서 만남. (내접) - r = |r1-r2|
		 *  5. 하나의 원이 다른 하나의 원 안에 있고 중점이 같지만 두원이 만나지 않을 때 - x1 = x2 & y1 = y2 & r1 != r2 
		 *  6. 두 원이 일치 ( x1 = x2 & y1 = y2 & r1 = r2 )
		 *  7. 하나의 원이 다른 하나의 원 안에 있고 중점이 다른데 만나지 않을 때 - r < |r2-r1|   
		 */
		double r = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		// 6번
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			System.out.println(-1);
		}
		// 1번, 5번, 7번
		else if (r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 || r < Math.abs(r1 - r2)) {
			System.out.println(0);
		}
		// 2번, 4번
		else if (r == r1 + r2 || r == Math.abs(r1 - r2)) {
			System.out.println(1);
		}
		// 3번
		else {
			System.out.println(2);
		}
	}

}
