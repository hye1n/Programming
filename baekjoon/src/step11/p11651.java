package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p11651 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine().trim());
		int[][] point = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine().trim());
			point[i][0] = Integer.parseInt(st.nextToken());
			point[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(point, new Comparator<int[]>() {

			@Override
			public int compare(int[] p1, int[] p2) {
				if (p1[1] == p2[1]) { // y°ª ºñ±³
					return Integer.compare(p1[0], p2[0]);
				}
				return Integer.compare(p1[1], p2[1]);
			}

		});
		for (int[] i : point) {
			bw.append(i[0] + " " + i[1] + "\n");
		}
		bw.flush();
		bw.close();
	}

}
