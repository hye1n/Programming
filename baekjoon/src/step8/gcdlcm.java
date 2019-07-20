package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gcdlcm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// �ִ������� �ּҰ���� �ڵ�

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println("�ִ����� : " + gcd(a, b));
		System.out.println("�ּҰ���� : " + lcm(a, b));
	}

	public static int gcd(int a, int b) {
		// ��Ŭ���� ȣ������ �̿��� �ִ�����
		// �� �� (a,b)���� a�� b�� ������ ������ r�� ã�´�.
		// n�� 0�̶�� b�� �ִ������̴�.
		// n�� 0�� �ƴ϶�� a���� b�� �ְ�, b�� n�� �־� ������ ������ r�� ����Ѵ�.(*�ݺ�)

		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}

		return a;
	}

	public static int lcm(int a, int b) {
		// �ִ������� �̿��� �ּҰ����
		return a * b / gcd(a, b);
	}

}
