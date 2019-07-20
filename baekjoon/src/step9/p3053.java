package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class p3053 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ��Ŭ���� ���ϰ��� ���� ����*r(������)����
		// �ýñ������� ���簢���̹Ƿ� �Ѻ��� ���� * �Ѻ��� ����
		// ����(2*r) = ��������� �밢���� ���� = �Ѻ��� ���� * ��Ʈ2
		// r�� ������, a�� �Ѻ��� ���̶�� �Ҷ�,
		// 2*r = ��Ʈ2*a => �纯 ����ó�� => 4*r*r = 2*a*a => ��� => 2*r*r = a*a
		// a*a�� ���簢���� ����! ��, 2*r*r�� ���Ѵٸ� �ýñ������� ���� ���̰� ���´�.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.000000");
		int r = Integer.parseInt(br.readLine().trim());

		System.out.println(df.format(Math.PI * r * r));
		System.out.println(df.format(2 * r * r));
	}

}
