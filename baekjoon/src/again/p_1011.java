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
		int n = (int) Math.round(Math.sqrt(dist)); // ������ �ݿø�ó��
		int std = (int) Math.ceil(Math.sqrt(dist)); // ������ �ø� ó��
		int ans = 2 * n - 1;
		if (std > n) {
			// ���� �ø�ó���� ���� �ݿø� ó���� �� ���� ũ��?
			// �̰� �ݿø� ó���� ������ �ƴ϶� �ø� ó���� ���� ���� ���߾�� �ϴ°ž�.
			// �׷��� 1�� �����ذž�.
			ans++;
		}
		System.out.println(ans);

	}

}
