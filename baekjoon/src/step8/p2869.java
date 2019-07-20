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
		// V-B 지점을 목표지점이라 생각하기
		// 왜? 달팽이가 목표 지점에 도달한 날에는 미끄러진 것을 감안하면 안되니까
		// 총 V-B 미터를 올라가게 되는 것과 같다.

		// 그래서 달팽이는 하루에 (A-B)씩 올라가서 (V-B)에 도달하는 것인데
		// 나눈게 딱 떨어지지 않을때 몫에 +1을 한 것이 정답
		// 저렇게 if문 안쓰고, ((V-B-1)/(A-B))+1 을 할 수 도 있음.
		day = (V - B) / (A - B);
		if ((V - B) % (A - B) != 0) {
			day++;
		}
		System.out.println(day);
	}

}
