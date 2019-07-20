package step9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = M; i <= N; i++) {
			int rootNum = (int) Math.sqrt(i);
			if (i == 1) {
				continue;
			}
			if (rootNum == 1) {
				arr.add(i);
				sum += i;
				continue;
			}
			boolean isPrimeNum = false;
			for (int r = 2; r <= rootNum; r++) {
				if (i % r == 0) {
					isPrimeNum = false;
					break;
				} else {
					isPrimeNum = true;
				}
			}
			if (isPrimeNum) {
				arr.add(i);
				sum += i;
			}
		}
		if (arr.size() == 0) {
			System.out.println(-1);
		} else {
			Collections.sort(arr);
			System.out.println(sum);
			System.out.println(arr.get(0));
		}
	}

}
