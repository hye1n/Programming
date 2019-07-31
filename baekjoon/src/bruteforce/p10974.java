package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10974 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (i + 1);
		}
		do {
			for (int i = 0; i < n; i++) {
				bw.append(arr[i] + " ");
			}
			bw.append("\n");
		} while (nextPermutation(arr, n));
		bw.flush();
		bw.close();

	}

	public static boolean nextPermutation(int[] arr, int n) {
		int i = n - 1;
		while (i > 0 && arr[i] <= arr[i - 1]) {
			i -= 1;
		}
		if (i <= 0) {
			return false;
		}
		int j = n - 1;
		while (arr[i - 1] >= arr[j]) {
			j -= 1;
		}
		swap(arr, i - 1, j);
		j = n - 1;
		while (i < j) {
			swap(arr, i, j);
			i += 1;
			j -= 1;
		}
		return true;
	}

	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		return arr;
	}

}
