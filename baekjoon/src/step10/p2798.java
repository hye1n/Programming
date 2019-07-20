package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2798 {
	public static int[] card;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		card = new int[n];
		st = new StringTokenizer(br.readLine().trim());
		for (int i = 0; i < card.length; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}

		int ans = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = (i + 1); j < n - 1; j++) {
				for (int k = (j + 1); k < n; k++) {
					int sum = card[i] + card[j] + card[k];
					if (ans < sum && sum <= m) {
						ans = sum;
					}
					
					/**
					 �Ʒ� �ڵ尡 �ȵƴ� ����.
					 int max = card[0]+card[1]+card[2];
					 �̷��� �ʱ�ȭ�� �س��� ������, max�� m���� Ŭ���� �־�
					 �׷� Math.max(max,sum)���⼭ m���� ū ���� ���� �� �ִ°���.
					 max = 0���� �ʱ�ȭ �س����� �Ʒ� �ڵ嵵 ��..
					 if (sum > m) {
						continue;
					} else if (sum == m) {
						System.out.println(sum);
						return;
					} else if (sum < m) {
						max = Math.max(max, sum);
					} 
					*/
				}
			}
		}
		System.out.println(ans);

	}

}
