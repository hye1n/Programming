package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p14500 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] map = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine().trim());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (j + 3 < m) { // 1
					int temp = map[i][j] + map[i][j + 1] + map[i][j + 2] + map[i][j + 3];
					if (max < temp)
						max = temp;
				}
				if (i + 3 < n) { // 2
					int temp = map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i + 3][j];
					if (max < temp)
						max = temp;
				}
				if (i + 1 < n && j + 1 < m) {// 3
					int temp = map[i][j] + map[i][j + 1] + map[i + 1][j] + map[i + 1][j + 1];
					if (max < temp)
						max = temp;
				}
				if (i + 2 < n && j + 1 < m) {// 4
					int temp = map[i][j] + map[i + 1][j] + map[i + 1][j + 1] + map[i + 2][j + 1];
					if (max < temp)
						max = temp;
				}
				if (i - 1 >= 0 && j + 2 < m) {// 5
					int temp = map[i][j] + map[i][j + 1] + map[i - 1][j + 1] + map[i - 1][j + 2];
					if (max < temp)
						max = temp;
				}
				if (i + 1 < n && j + 2 < m) {// 6
					int temp = map[i][j] + map[i][j + 1] + map[i + 1][j + 1] + map[i + 1][j + 2];
					if (max < temp)
						max = temp;
				}
				if (i + 2 < n && j - 1 >= 0) {// 7
					int temp = map[i][j] + map[i + 1][j] + map[i + 1][j - 1] + map[i + 2][j - 1];
					if (max < temp)
						max = temp;
				}
				if (i + 2 < n && j - 1 >= 0) {// 8
					int temp = map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i + 2][j - 1];
					if (max < temp)
						max = temp;
				}
				if (i + 2 < n && j + 1 < m) { // 9
					int temp = map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i + 2][j + 1];
					if (max < temp)
						max = temp;
				}
				if (i + 1 < n && j + 2 < m) {// 10
					int temp = map[i][j] + map[i][j + 1] + map[i][j + 2] + map[i + 1][j];
					if (max < temp)
						max = temp;
				}
				if (i + 1 < n && j + 2 < m) {// 11
					int temp = map[i][j] + map[i][j + 1] + map[i][j + 2] + map[i + 1][j + 2];
					if (max < temp)
						max = temp;
				}
				if (i + 1 < n && j + 2 < m) {// 12
					int temp = map[i][j] + map[i + 1][j] + map[i + 1][j + 1] + map[i + 1][j + 2];
					if (max < temp)
						max = temp;
				}
				if (i - 1 >= 0 && j + 2 < m) { // 13
					int temp = map[i][j] + map[i][j + 1] + map[i][j + 2] + map[i - 1][j + 2];
					if (max < temp)
						max = temp;
				}
				if (i + 2 < n && j + 1 < m) {// 14
					int temp = map[i][j] + map[i][j + 1] + map[i + 1][j + 1] + map[i + 2][j + 1];
					if (max < temp)
						max = temp;
				}
				if (i + 2 < n && j + 1 < m) {// 15
					int temp = map[i][j] + map[i][j + 1] + map[i + 1][j] + map[i + 2][j];
					if (max < temp)
						max = temp;
				}

				if (i + 2 < n) {
					int temp = map[i][j] + map[i + 1][j] + map[i + 2][j];
					if (j + 1 < m) {// 16
						int temp2 = temp + map[i + 1][j + 1];
						if (max < temp2)
							max = temp2;
					}
					if (j - 1 >= 0) {// 17
						int temp2 = temp + map[i + 1][j - 1];
						if (max < temp2)
							max = temp2;
					}
				}
				if (j + 2 < m) {
					int temp = map[i][j] + map[i][j + 1] + map[i][j + 2];
					if (i + 1 < n) {// 18
						int temp2 = temp + map[i + 1][j + 1];
						if (max < temp2)
							max = temp2;
					}
					if (i - 1 >= 0) {// 19
						int temp2 = temp + map[i - 1][j + 1];
						if (max < temp2)
							max = temp2;
					}
				}

			}
		}
		bw.append(String.valueOf(max));
		bw.flush();
		bw.close();
	}

}
