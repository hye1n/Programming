package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p14501 {
	public static int max = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] t = new int[n + 1];
		int[] p = new int[n + 1];
		StringTokenizer st;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		solve(n, t, p, 1, 0);
		bw.append(String.valueOf(max));
		bw.flush();
		bw.close();
	}

	public static void solve(int n, int[] t, int[] p, int i, int sum) {
		if (i == n + 1) {
			max = Math.max(max, sum);
			return;
		}
		if (i > n + 1) {
			return;
		}
		solve(n, t, p, i + t[i], sum + p[i]);
		solve(n, t, p, i + 1, sum);
	}

}
