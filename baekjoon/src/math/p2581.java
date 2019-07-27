package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2581 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int m = Integer.parseInt(br.readLine().trim());
		int n = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[n - m + 1];
		int idx = 0;
		for (int i = m; i <= n; i++) {
			arr[idx++] = i;
		}
		int sumPrimeNum = 0;
		int minPrimeNum = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				continue;
			}
			int rootNum = (int) Math.sqrt(arr[i]);
			boolean isPrime = true;
			for (int j = 2; j <= rootNum; j++) {
				if (arr[i] % j == 0) {
					isPrime = false;
					break;
				}
				isPrime = true;
			}
			if (isPrime) {
				sumPrimeNum += arr[i];
				if (arr[i] < minPrimeNum) {
					minPrimeNum = arr[i];
				}
			}
		}
		if (sumPrimeNum == 0) {
			bw.append(String.valueOf(-1));
		} else {
			bw.append(sumPrimeNum + "\n" + minPrimeNum);
		}
		bw.flush();
		bw.close();
	}

}
