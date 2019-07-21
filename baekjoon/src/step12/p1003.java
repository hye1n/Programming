package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1003 {
	// N이 주어졌을때, fibonacci(N)호출시,0과 1이 각각 몇번 호출되는가
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tc; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			bw.append(fibo(num) + " " + fibo(num + 1) + "\n");
			// 현재 숫자(num)의 1의 개수는 다음숫자(num+1)의 0의 개수와 같으니까
		}
		bw.flush();
		bw.close();
	}

	public static int fibo(int num) {// 0의 개수만 리턴

		// 숫자 = (0호출 개수, 1호출 개수, 합)
		// fibo(0) = (1, 0, 1)
		// fibo(1) = (0, 1, 1)
		// fibo(2) = (1, 1, 2)
		// fibo(3) = (1, 2, 3)
		// num-1의 1개수가 num의 0개수가 되고, num-1의 0개수와 1개수의 합이 num의 1개수가 된다.

		// num이 0일 경우 초기값
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
