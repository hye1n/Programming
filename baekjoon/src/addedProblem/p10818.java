package addedProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p10818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());

		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine().trim());
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			max = Math.max(num, max);
			min = Math.min(num, min);
		}

		System.out.println(min + " " + max);
	}

}
