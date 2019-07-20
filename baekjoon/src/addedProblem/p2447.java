package addedProblem;

import java.util.Arrays;
import java.util.Scanner;

public class p2447 {

	static char map[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		map = new char[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(map[i], ' ');
		}
		printStar(0, 0, n);
		for (int i = 0; i < n; i++) {
			System.out.println(map[i]);
		}

	}

	public static void printStar(int x, int y, int num) {
		if (num == 1) {
			map[x][y] = '*';// 현재 위치를 *로 채우기
			return;
		}
		int div = num / 3;// 3으로 나눠줘, 왜냐하면 3*3 형태가 반복되니까..?
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1) {
					continue;
				} else {
					printStar(x + (i * div), y + (j * div), div);
				}
			}
		}
	}
}
