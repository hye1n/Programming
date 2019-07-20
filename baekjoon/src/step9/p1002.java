package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1002 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// �� ���� ������ ������ ���ϴ� ����..�Ϳ�~
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			solve(x1, y1, r1, x2, y2, r2);
		}
	}

	public static void solve(int x1, int y1, int r1, int x2, int y2, int r2) {
		/**
		 *  1. �� ���� �ʹ� �� �� -  r > r1 + r2
		 *  2. �� ���� �������� ����. (����) - r = r1 + r2
		 *  3. �� ���� - ������ ����
		 *  4. �� ���� �������� ����. (����) - r = |r1-r2|
		 *  5. �ϳ��� ���� �ٸ� �ϳ��� �� �ȿ� �ְ� ������ ������ �ο��� ������ ���� �� - x1 = x2 & y1 = y2 & r1 != r2 
		 *  6. �� ���� ��ġ ( x1 = x2 & y1 = y2 & r1 = r2 )
		 *  7. �ϳ��� ���� �ٸ� �ϳ��� �� �ȿ� �ְ� ������ �ٸ��� ������ ���� �� - r < |r2-r1|   
		 */
		double r = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		// 6��
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			System.out.println(-1);
		}
		// 1��, 5��, 7��
		else if (r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 || r < Math.abs(r1 - r2)) {
			System.out.println(0);
		}
		// 2��, 4��
		else if (r == r1 + r2 || r == Math.abs(r1 - r2)) {
			System.out.println(1);
		}
		// 3��
		else {
			System.out.println(2);
		}
	}

}
