package step8;

import java.util.Scanner;

public class p2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int standard = 6;
		int multiple = 1;
		int max = 1 + (standard * multiple);
		while (true) {
			if (n == 1) {
				System.out.println(1);
				break;
			}
			if (n <= max) {
				System.out.println(multiple + 1);
				break;
			} else {
				multiple++;
				max += (standard * multiple);
			}
		}

	}

}
