package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p7568 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[] weight = new int[n];
		int[] height = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine().trim());
			weight[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if (weight[i] < weight[j] && height[i] < height[j]) {
					cnt++;
				}
			}
			sb.append((cnt + 1) + " ");
		}
		System.out.println(sb.toString());
	}

}
