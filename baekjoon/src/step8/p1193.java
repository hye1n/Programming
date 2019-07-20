package step8;

import java.util.Scanner;

public class p1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		int totalCnt = 0;
		int lineNum = 1;
		while (true) {
			totalCnt += lineNum;
			if (x <= totalCnt) {
				break;
			} else {
				lineNum++;
			}
		}
		int start = (totalCnt - lineNum) + 1;
		int child, parent;
		if (lineNum % 2 == 0) {// Â¦¼öÀÌ¸é
			child = 1;
			parent = lineNum;
			for (int i = (start + 1); i <= x; i++) {
				child += 1;
				parent -= 1;
			}
		} else {
			child = lineNum;
			parent = 1;
			for (int i = (start + 1); i <= x; i++) {
				child -= 1;
				parent += 1;
			}
		}
		System.out.println(child + "/" + parent);
	}

}
