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
			// 제곱근을 이용하는 이유!
			// 12의 제곱근은 3.xx, 이걸 int형으로 하면 3이 나와~
			// 12는 1*12, 2*6, 3*4 잖아
			// 여기서 1은 제외하고, 2부터 제곱근(여기선 3)으로 12를 나누면 몫이 딱 6, 4 나오지
			// 나누었을때 나머지는 0이고! 그럼 이건 그게 약수란 소리잖아.
			// 그니까 2부터 제곱근까지의 수로 N을 나누었을때, 나누어 떨어지면? 소수가 아니다~
			// 근데 N이 1이면 당연히 소수아니니까 continue,
			// 2,3,5는 제곱근이 1이더라? 그럼 소수라 쳤어

			if (num == 1) {
				continue;
			}
			if (rootNum == 1) {
				count++;
				continue;
			}
			boolean isPrime = false;
			for (int p = 2; p <= rootNum; p++) {
				if (num % p == 0) {// 나누어 떨어졌다는건 소수가 아니란거야
					isPrime = false;
					break;
				} else {// 나누어 떨어지지 않았어? 그럼 소수야
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
