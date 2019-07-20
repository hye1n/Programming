package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2775 {
	static int apartment[][];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tc; i++) {
			int floor = Integer.parseInt(br.readLine().trim());
			int num = Integer.parseInt(br.readLine().trim());
			apartment = new int[floor][num + 1];
			solve(floor, num);
		}
	}

	public static void solve(int floor, int num) {

		for (int i = 1; i <= num; i++) {
			apartment[0][i] = i;// 0층 고정
		}
		int temp = 1;
		while (true) {
			if (temp >= floor || (floor - 1) == 0) {
				break;
			}
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					apartment[temp][i] += apartment[(temp - 1)][j];
				}
			}
			temp++;
		}

		int total = 0;
		for (int i = 1; i <= num; i++) {
			total += apartment[floor - 1][i];
		}
		System.out.println(total);

	}

	// 재귀를 이용한 방식!
	public static int getResidents(int floor, int num) {
		if (floor == 0) {
			// 0층이면 호수 그자체를 리턴. 왜? 0층 i호는 i명이 사니까.
			return num;
		} else {
			int r = 0;
			for (int i = 1; i <= num; i++) {
				r += getResidents((floor - 1), num);
				// 층을 한층씩 낮추고 해당 호수의 사람을 구함(0층 i호부터 차례대로 더해지겠지)
			}
			return r;
		}
	}

}
