package addedProblem;

import java.util.Scanner;

public class p2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		if (year % 4 != 0) {
			System.out.println(0);
		} else {
			if (year % 400 == 0) {
				System.out.println(1);
			} else if (year % 100 == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
	}

}
