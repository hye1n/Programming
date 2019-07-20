package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1107 {
	static boolean[] broken = new boolean[10];// 각 index가 고장난걸 말해줄거야

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int m = Integer.parseInt(br.readLine().trim());
		int answer = Math.abs(n - 100);// +버튼 또는 -버튼으로만 이동한 횟수
		if (m > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			for (int i = 0; i < m; i++) { // 해당 index번째버튼이 고장났다면 true
				broken[Integer.parseInt(st.nextToken())] = true;
			}
		}

		// 채널은 무한대마늠 있지만, N의 범위는 0<=N<=500,000이므로
		// 0에서 500,000으로 이동하는 횟수가 500,000이므로,
		// 반대로500,000+500,000= 1,000,000 까지만 구하면 됨
		for (int i = 0; i < 1000000; i++) { // 숫자 버튼으로 0~1,000,000까지 간다했을때!
			int channel = i;
			int length = canMove(channel);// 해당 채널의 길이를 가져와서, 0보다 크면!
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
		// 이동이 가능한 채널이면 채널의 길이를, 이동이 불가능하면 0을 리턴함
		int length = 0;
		if (channel == 0) {
			return broken[0] ? 0 : 1;
		}
		while (channel > 0) {
			if (broken[channel % 10]) {
				// 마지막 자리부터 비교!해서 망가져있으면 0리턴
				return 0;
			}
			length += 1;
			// 채널의 길이= 채널을 누르는 횟수
			channel /= 10;
		}
		return length;
	}

}
