package step9;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		// bufferedwriter를 사용해서 출력 가능하다~ 근데 왜 더 시간이 걸리지?ㅇㅅㅇ
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		for (int i = M; i <= N; i++) {
			int rootNum = (int) Math.sqrt(i);
			if (i == 1) {
				continue;
			}
			if (rootNum == 1) {
				sb.append(i + "\n");
//				bw.write(i + "\n");
			}
			boolean isPrime = false;
			for (int r = 2; r <= rootNum; r++) {
				if (i % r == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
			if (isPrime) {
				sb.append(i + "\n");
//				bw.write(i + "\n");
			}
		}
		System.out.println(sb.toString());
//		bw.flush();
//		bw.close();

	}

}
