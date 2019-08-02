package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1182 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int s = Integer.parseInt(input[1]);
		int[] arr = new int[n];
		input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		int count = solve(s, arr, 0, 0);
		if (s == 0) {
			count -= 1;
		}
		bw.append(String.valueOf(count));
		bw.flush();
		bw.close();
	}

	public static int solve(int s, int[] arr, int i, int sum) {
		if (i == arr.length) {
			if (sum == s) {
				return 1;
			} else {
				return 0;
			}
		}
		return solve(s, arr, i + 1, sum + arr[i]) + solve(s, arr, i + 1, sum);
	}
}
