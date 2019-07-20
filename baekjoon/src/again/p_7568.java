package again;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p_7568 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] weight = new int[n];
		int[] height = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				if (weight[i] < weight[j] && height[i] < height[j]) {
					cnt++;
				}

			}
			bw.append(cnt + " ");
		}
		bw.flush();
		bw.close();
	}

}
