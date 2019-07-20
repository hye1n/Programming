package addedProblem;

import java.util.Scanner;

public class p11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 1; i <= t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Case #" + i + ": " + (a + b));
		}
	}

}
