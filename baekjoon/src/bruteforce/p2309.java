package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p2309 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = 9;
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine().trim());
			sum += arr[i];
		}
		Arrays.sort(arr);
		boolean check = false;
		for (int i = 0; i < n - 1; i++) {
			if (check) {
				break;
			}
			for (int j = i + 1; j < n; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					for (int k = 0; k < n; k++) {
						if (i != k && j != k) {
							bw.append(arr[k] + "\n");
						}
					}
					check = true;
				}
			}
		}

		bw.flush();
		bw.close();
	}

}
