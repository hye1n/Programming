package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p6064 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int tc = Integer.parseInt(st.nextToken());
		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			solve(M, N, x, y);

		}

	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static void solve(int M, int N, int x, int y) {

		int maxYear = lcm(M, N); // M과 N의 최소공배수가 멸망년도

		while (true) {
			// x가 멸망년도보다 커지거나 x,y를 만족하는 년도를 찾았을때 break
			if (x > maxYear || (((x - 1) % N) + 1) == y) {
				// ** ((x-1)%N)+1 이 무엇인가?
				// mod 연산의 결과는 0~N-1인데, 문제에서 x=1로 초기화 되므로 1~N을 원함
				// 따라서 x-1에 대해 mod 연산을 하고 1을 더해줌
				break;
			}
			x += M;
			// x를 M으로 나누었을때, x이여야 하기때문에 x에 M을 더해줌
		}
		if (x > maxYear) {
			System.out.println(-1);
		} else {
			System.out.println(x);
		}
	}

}
