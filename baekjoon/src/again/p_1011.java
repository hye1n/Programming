package again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1011 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int tc = Integer.parseInt(st.nextToken());
		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			solve(y - x);
		}
	}

	public static void solve(int dist) {
		int n = (int) Math.round(Math.sqrt(dist)); // 제곱근 반올림처리
		int std = (int) Math.ceil(Math.sqrt(dist)); // 제곱근 올림 처리
		int ans = 2 * n - 1;
		if (std > n) {
			// 만약 올림처리한 수가 반올림 처리한 수 보다 크다?
			// 이건 반올림 처리를 따를게 아니라 올림 처리를 따라서 값을 구했어야 하는거야.
			// 그래서 1을 더해준거야.
			ans++;
		}
		System.out.println(ans);

	}

}
