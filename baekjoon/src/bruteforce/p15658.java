package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class p15658 {
	static ArrayList<Integer> result = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		input = br.readLine().split(" ");
		int plus = Integer.parseInt(input[0]);
		int minus = Integer.parseInt(input[1]);
		int mul = Integer.parseInt(input[2]);
		int div = Integer.parseInt(input[3]);
		solve(num, 1, plus, minus, mul, div, num[0]);
		Collections.sort(result);
		bw.append(result.get(result.size() - 1) + "\n" + result.get(0));
		bw.flush();
		bw.close();
	}

	public static void solve(int[] num, int i, int plus, int minus, int mul, int div, int cur) {
		if (i == num.length) {
			result.add(cur);
			return;
		}
		if (plus > 0) {
			solve(num, i + 1, plus - 1, minus, mul, div, cur + num[i]);
		}
		if (minus > 0) {
			solve(num, i + 1, plus, minus - 1, mul, div, cur - num[i]);
		}
		if (mul > 0) {
			solve(num, i + 1, plus, minus, mul - 1, div, cur * num[i]);
		}
		if (div > 0) {
			solve(num, i + 1, plus, minus, mul, div - 1, cur / num[i]);
		}
	}
}
