package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class p1181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// n���� �ܾ ������ 1. ���̰� ª���ͺ���, 2. ���̰� ������ ���� ������
		// ���� �ܾ ������ �ԷµǴ� ��쿣 �ѹ����� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		// HashSet�� �ߺ��� ������� �ʴ´�..!!!
		HashSet<String> hash = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			hash.add(br.readLine().trim());
		}
		String[] str = new String[hash.size()];
		hash.toArray(str);
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return Integer.compare(o1.length(), o2.length());
			}
		});

		for (String i : str) {
			bw.append(i + "\n");
		}
		bw.flush();
		bw.close();
	}

}
