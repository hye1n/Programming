package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p10814 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ������ ������� �Է��� ���´�, �̸��� ��ҹ��ڷ� �̷����
		// ���̰� �����ϴ� ������, ���̰� ������ ���� ������ ����� �տ� ������
		// ������ ������� �Է��� ������ ������! �̹� ���Լ��� ������ �Ǿ��־�
		// �׷��� ���̼����θ� ������ �ϸ� �ȴ�..�Ϳ쳻,,,

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine().trim());
		String[][] str = new String[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine().trim());
			str[i][0] = st.nextToken();// ����
			str[i][1] = st.nextToken();// �̸�
		}
		Arrays.sort(str, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		for (String[] i : str) {
			bw.append(i[0] + " " + i[1] + "\n");
		}
		bw.flush();
		bw.close();
	}

}
