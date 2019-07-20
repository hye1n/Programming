package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2869 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		int day = 0;
		// V-B ������ ��ǥ�����̶� �����ϱ�
		// ��? �����̰� ��ǥ ������ ������ ������ �̲����� ���� �����ϸ� �ȵǴϱ�
		// �� V-B ���͸� �ö󰡰� �Ǵ� �Ͱ� ����.

		// �׷��� �����̴� �Ϸ翡 (A-B)�� �ö󰡼� (V-B)�� �����ϴ� ���ε�
		// ������ �� �������� ������ �� +1�� �� ���� ����
		// ������ if�� �Ⱦ���, ((V-B-1)/(A-B))+1 �� �� �� �� ����.
		day = (V - B) / (A - B);
		if ((V - B) % (A - B) != 0) {
			day++;
		}
		System.out.println(day);
	}

}
