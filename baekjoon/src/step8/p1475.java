package step8;

import java.util.Scanner;

public class p1475 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int duplicateNumberArr[] = new int[10];// �ߺ� ���� ��� �迭
		int n = scan.nextInt();

		if (n == 0) {
			System.out.println(1);
			return;
		}
		String str = Integer.toString(n);
		for (int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - '0';
			if (num == 6) {
				num = 9;
			}
			duplicateNumberArr[num]++;
		}
		int nineCnt = duplicateNumberArr[9] % 2 == 0 ? duplicateNumberArr[9] / 2 : duplicateNumberArr[9] / 2 + 1;
		duplicateNumberArr[9] = nineCnt;
		int max = Integer.MIN_VALUE;
		for (int i : duplicateNumberArr) {
			max = Math.max(i, max);
		}
		System.out.println(max);

	}
}
