package addedProblem;

import java.util.Scanner;

public class p2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int m = scan.nextInt();

		if (h == 0) {
			h = 24;
		}
		if (m < 45) {
			h -= 1;
			m = (m + 60) - 45;
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m - 45));
		}
	}

}
