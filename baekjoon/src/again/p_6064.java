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
				// �ּҰ������ �Ѿ�� �Ǹ�! 1:1���� �����ϱ⶧���� �ּҰ������ �Ѿ�� �ȵ�.
				// x%N���� �� ��쿡�� x�� N�� ������쿡 0���� ����. �ٵ� �⵵�� 1~N������
				// x%N+1���� �� ��쿡�� x�� N���� ���� ���, 2~N������ ����
				// (x-1)%N+1���� �� ��쿣, 1~N���� �ùٸ� ������ ǥ���� ��
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
