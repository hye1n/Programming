package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p6603 {
	public static ArrayList<Integer> lotto = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			if (n == 0) {
				break;
			}
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(input[i + 1]);
			}
			solve(arr, 0, 0);
			System.out.println();
		}
	}

	public static void solve(int[] arr, int idx, int cnt) {
		if (cnt == 6) {
			for (int num : lotto) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		if (idx >= arr.length) {
			return;
		}
		lotto.add(arr[idx]);
		solve(arr, idx + 1, cnt + 1);
		lotto.remove(lotto.size() - 1);
		solve(arr, idx + 1, cnt);
	}

}
