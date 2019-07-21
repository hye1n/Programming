package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1003 {
	// N�� �־�������, fibonacci(N)ȣ���,0�� 1�� ���� ��� ȣ��Ǵ°�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tc; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			bw.append(fibo(num) + " " + fibo(num + 1) + "\n");
			// ���� ����(num)�� 1�� ������ ��������(num+1)�� 0�� ������ �����ϱ�
		}
		bw.flush();
		bw.close();
	}

	public static int fibo(int num) {// 0�� ������ ����

		// ���� = (0ȣ�� ����, 1ȣ�� ����, ��)
		// fibo(0) = (1, 0, 1)
		// fibo(1) = (0, 1, 1)
		// fibo(2) = (1, 1, 2)
		// fibo(3) = (1, 2, 3)
		// num-1�� 1������ num�� 0������ �ǰ�, num-1�� 0������ 1������ ���� num�� 1������ �ȴ�.

		// num�� 0�� ��� �ʱⰪ
		int zeroCnt = 1, oneCnt = 0, sum = zeroCnt + oneCnt;

		if (num == 0) {
			return 1;
		} else if (num == 1) {
			return 0;
		} else {
			for (int i = 1; i <= num; i++) {
				zeroCnt = oneCnt;
				oneCnt = sum;
				sum = zeroCnt + oneCnt;
			}
			return zeroCnt;
		}
	}

}
