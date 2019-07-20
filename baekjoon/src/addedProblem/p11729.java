package addedProblem;

import java.util.Scanner;

public class p11729 {

	public static int ans = 0;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		hanoiTower(n, 1, 2, 3);
		sb.insert(0, ans + "\n");
		System.out.println(sb);
	}

	// from�� �����ִ� num���� ������ by�� ���� to�� �̵��Ѵ�.
	public static void hanoiTower(int num, int from, int by, int to) {
		ans++;
		if (num == 1) {
			sb.append(from + " " + to + "\n");
		} else {
			// step1: num-1���� A���� B�� �̵�
			hanoiTower(num - 1, from, to, by);
			// step2 : 1���� A���� C�� �̵�
			sb.append(from + " " + to + "\n");
			// step3 : num-1���� B���� C�� �̵�
			hanoiTower(num - 1, by, from, to);
		}
	}

}
