package addedProblem;

import java.util.Scanner;

public class p2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a * b;
		while (b != 0) {
			System.out.println((b % 10) * a);
			b /= 10;
		}
		System.out.println(result);

	}

}
