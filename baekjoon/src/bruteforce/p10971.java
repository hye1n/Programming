package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p10971 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		int[][] cost = new int[n][n];
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
			st = new StringTokenizer(br.readLine().trim());
			for (int j = 0; j < n; j++) {
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int min = Integer.MAX_VALUE;
		do {
			if (arr[0] != 0) {
				break;
			}
			// 1 2 3 4 , 2 3 4 1, 3 4 1 2, 4 1 2 3 은 모두 같은 경우이기 때문에
			// 시작점을 고정!
			boolean connected = true;
			int temp = 0;
			for (int i = 0; i < n - 1; i++) {
				if (cost[arr[i]][arr[i + 1]] == 0) {
					connected = false;
				} else {
					temp += cost[arr[i]][arr[i + 1]];
				}
			}

			if (connected && cost[arr[n - 1]][arr[0]] != 0) {
				temp += cost[arr[n - 1]][arr[0]];
				min = Math.min(min, temp);
			}

		} while (nextPermutation(arr, n));
		bw.append(String.valueOf(min));
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
