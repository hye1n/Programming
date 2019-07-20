package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gcdlcm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 최대공약수와 최소공배수 코딩

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println("최대공약수 : " + gcd(a, b));
		System.out.println("최소공배수 : " + lcm(a, b));
	}

	public static int gcd(int a, int b) {
		// 유클리드 호제법을 이용한 최대공약수
		// 두 수 (a,b)에서 a를 b로 나누어 나머지 r을 찾는다.
		// n이 0이라면 b가 최대공약수이다.
		// n이 0이 아니라면 a에는 b를 넣고, b에 n을 넣어 나누어 나머지 r을 계산한다.(*반복)

		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}

		return a;
	}

	public static int lcm(int a, int b) {
		// 최대공약수를 이용한 최소공배수
		return a * b / gcd(a, b);
	}

}
