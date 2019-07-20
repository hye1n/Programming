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
		// �̵��Ÿ��� ������ ���� �ø�ó������
		// ex) dist = 6, n = 3
		int maxDist = (int) Math.pow(Math.ceil(Math.sqrt(dist)), 2);
		// �ִ� �Ÿ��� n���� ����(n^2),[1,4,9,16,...]
		int maxNum = n * 2 - 1;
		// �ִ�Ÿ��� ���� �ִ� �̵�Ƚ�� ���� 2*n-1�̴�. [1,3,5,7,...]
		int cnt = maxNum;
		if (dist <= maxDist - n) {
			// 1, 121, 12321, 1234321,..�� ������,
			// n�� 2�̸� 11, 6�̸� 1221, 14�� 123321�̴�.
			// �״ϱ� �ִ�Ƚ������ 1�� ���ָ�! �ִ� ���ȿ��� ¦�� Ƚ���϶� ó���� ���ذ���
			cnt = maxNum - 1;
		}
		System.out.println(cnt);
	}

}
