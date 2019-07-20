package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1018 {

	static char[][] map;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		int row = Integer.parseInt(line.split(" ")[0]);
		int column = Integer.parseInt(line.split(" ")[1]);
		map = new char[row][column];
		for (int i = 0; i < row; i++) {
			line = br.readLine().trim();
			for (int j = 0; j < column; j++) {
				map[i][j] = line.charAt(j);// 입력받아 저장
			}
		}
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < row - 7; i++) {
			for (int j = 0; j < column - 7; j++) {
				result = Math.min(result, solve(i, j));
			}
		}
		System.out.println(result);

	}

	public static int solve(int x, int y) {
		String[] bBoard = { "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW",
				"WBWBWBWB" };
		String[] wBoard = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB",
				"BWBWBWBW" };
		int bResult = 0;
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				if (bBoard[i - x].charAt(j - y) != map[i][j]) {
					bResult++;
				}
			}
		}
		int wResult = 0;
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				if (wBoard[i - x].charAt(j - y) != map[i][j]) {
					wResult++;
				}
			}
		}
		return Math.min(bResult, wResult);
	}

}
