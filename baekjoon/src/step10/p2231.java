package step10;

import java.util.Scanner;

public class p2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = (n - 1); i > 0; i--) {
			sum = i;
			int length = Integer.toString(i).length();
			for (int j = 0; j < length; j++) {
				int num = Integer.toString(i).charAt(j) - '0';
				sum += num;
				if (length == (j + 1)) {
					if (sum == n) {
						min = (min > i) ? i : min;
					}
				} else if (sum >= n) { // 마지막자리까지 더하지도않았는데 n을 넘는거야
					break;
				}

			}
		}
		int ans = (min == Integer.MAX_VALUE) ? 0 : min;
		System.out.println(ans);
	}

}
