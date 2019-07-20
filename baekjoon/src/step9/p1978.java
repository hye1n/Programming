package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1978 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine().trim());
		int count = 0;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			int rootNum = (int) Math.sqrt(num);
			// �������� �̿��ϴ� ����!
			// 12�� �������� 3.xx, �̰� int������ �ϸ� 3�� ����~
			// 12�� 1*12, 2*6, 3*4 �ݾ�
			// ���⼭ 1�� �����ϰ�, 2���� ������(���⼱ 3)���� 12�� ������ ���� �� 6, 4 ������
			// ���������� �������� 0�̰�! �׷� �̰� �װ� ����� �Ҹ��ݾ�.
			// �״ϱ� 2���� �����ٱ����� ���� N�� ����������, ������ ��������? �Ҽ��� �ƴϴ�~
			// �ٵ� N�� 1�̸� �翬�� �Ҽ��ƴϴϱ� continue,
			// 2,3,5�� �������� 1�̴���? �׷� �Ҽ��� �ƾ�

			if (num == 1) {
				continue;
			}
			if (rootNum == 1) {
				count++;
				continue;
			}
			boolean isPrime = false;
			for (int p = 2; p <= rootNum; p++) {
				if (num % p == 0) {// ������ �������ٴ°� �Ҽ��� �ƴ϶��ž�
					isPrime = false;
					break;
				} else {// ������ �������� �ʾҾ�? �׷� �Ҽ���
					isPrime = true;
				}
			}
			if (isPrime) {
				count++;
			}
		}
		System.out.println(count);
	}

}
