package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1011 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int tc = Integer.parseInt(st.nextToken());
		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			solve(y - x);
		}
	}

	private static void solve(int dist) {

		int n = (int) Math.ceil(Math.sqrt(dist));
		// 이동거리의 제곱근 값을 올림처리해줌
		// ex) dist = 6, n = 3
		int maxDist = (int) Math.pow(Math.ceil(Math.sqrt(dist)), 2);
		// 최대 거리는 n값의 제곱(n^2),[1,4,9,16,...]
		int maxNum = n * 2 - 1;
		// 최대거리에 따른 최대 이동횟수 값은 2*n-1이다. [1,3,5,7,...]
		int cnt = maxNum;
		if (dist <= maxDist - n) {
			// 1, 121, 12321, 1234321,..이 있을때,
			// n이 2이면 11, 6이면 1221, 14면 123321이다.
			// 그니까 최대횟수에서 1을 빼주면! 최대 경계안에서 짝수 횟수일때 처리를 해준거임
			cnt = maxNum - 1;
		}
		System.out.println(cnt);
	}

}
