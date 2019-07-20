package again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_6064 {

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

	public static void solve(int M, int N, int x, int y) {
		int maxYear = lcm(M, N);
		while (true) {
			if (x > maxYear || ((x - 1) % N) + 1 == y) {
				break;
				// 최소공배수를 넘어가게 되면! 1:1부터 시작하기때문에 최소공배수를 넘어가면 안돼.
				// x%N으로 할 경우에는 x와 N이 같을경우에 0으로 나와. 근데 년도는 1~N까지야
				// x%N+1으로 할 경우에는 x가 N보다 작을 경우, 2~N까지로 나와
				// (x-1)%N+1으로 할 경우엔, 1~N까지 올바른 범위로 표현이 돼
			}
			x += M;
		}
		if (x > maxYear) {
			System.out.println(-1);
		} else {
			System.out.println(x);
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
}
