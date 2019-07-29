package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1476 {

	static int maxE = 15;
	static int maxS = 28;
	static int maxM = 19;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int E = Integer.parseInt(input[0]);
		int S = Integer.parseInt(input[1]);
		int M = Integer.parseInt(input[2]);
		int year = 1;
		while (true) {
			int e = year % maxE == 0 ? maxE : year % maxE;
			int s = year % maxS == 0 ? maxS : year % maxS;
			int m = year % maxM == 0 ? maxM : year % maxM;
			if (e == E && s == S && m == M) {
				bw.append(String.valueOf(year));
				break;
			}
			year++;

		}
		bw.flush();
		bw.close();
	}

}
