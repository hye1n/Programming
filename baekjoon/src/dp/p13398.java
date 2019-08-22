package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p13398 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		int[] dp = new int[n];
		int[] dpr = new int[n];
		for (int i = 0; i < n; i++) {
			dp[i] = arr[i];
			if (i > 0 && dp[i] < dp[i - 1] + arr[i]) {
				dp[i] = dp[i - 1] + arr[i];
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			dpr[i] = arr[i];
			if (i < n - 1 && dpr[i] < dpr[i + 1] + arr[i]) {
				dpr[i] = dpr[i + 1] + arr[i];
			}
		}
		int ans = dp[0];
		for (int i = 1; i < n; i++) {// 아무것도 제거하지 않았을때 최댓값
			ans = Math.max(ans, dp[i]);
		}
		for (int i = 1; i < n - 1; i++) {// 차례대로 하나씩 제거했을때 최댓값
			ans = Math.max(ans, dp[i - 1] + dpr[i + 1]);
		}

		System.out.println(ans);

	}

}
