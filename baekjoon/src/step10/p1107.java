package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1107 {
	static boolean[] broken = new boolean[10];// �� index�� ���峭�� �����ٰž�

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int m = Integer.parseInt(br.readLine().trim());
		int answer = Math.abs(n - 100);// +��ư �Ǵ� -��ư���θ� �̵��� Ƚ��
		if (m > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			for (int i = 0; i < m; i++) { // �ش� index��°��ư�� ���峵�ٸ� true
				broken[Integer.parseInt(st.nextToken())] = true;
			}
		}

		// ä���� ���Ѵ븶�� ������, N�� ������ 0<=N<=500,000�̹Ƿ�
		// 0���� 500,000���� �̵��ϴ� Ƚ���� 500,000�̹Ƿ�,
		// �ݴ��500,000+500,000= 1,000,000 ������ ���ϸ� ��
		for (int i = 0; i < 1000000; i++) { // ���� ��ư���� 0~1,000,000���� ����������!
			int channel = i;
			int length = canMove(channel);// �ش� ä���� ���̸� �����ͼ�, 0���� ũ��!
			if (length > 0) {
				int press = Math.abs(channel - n);
				if (answer > length + press) {
					answer = length + press;
				}
			}
		}
		System.out.println(answer);
	}

	public static int canMove(int channel) {
		// �̵��� ������ ä���̸� ä���� ���̸�, �̵��� �Ұ����ϸ� 0�� ������
		int length = 0;
		if (channel == 0) {
			return broken[0] ? 0 : 1;
		}
		while (channel > 0) {
			if (broken[channel % 10]) {
				// ������ �ڸ����� ��!�ؼ� ������������ 0����
				return 0;
			}
			length += 1;
			// ä���� ����= ä���� ������ Ƚ��
			channel /= 10;
		}
		return length;
	}

}
