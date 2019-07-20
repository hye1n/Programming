package step8;

import java.util.Scanner;

public class p1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (b >= c) {
			System.out.println(-1);
			return;
		}

		int ans = a / (c - b) + 1;
		System.out.println(ans);
	}
}
