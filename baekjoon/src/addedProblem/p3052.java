package addedProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p3052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int result2[] = new int[10];
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int num = Integer.parseInt(st.nextToken());
			result2[i] = num % 42;

		}
		Arrays.sort(result2);
		int count = 1;
		for (int i = 0; i < 9; i++) {
			if (result2[i] != result2[i + 1]) {
				count++;
			}
		}
		System.out.println(count);
	}
	/*
	ArrayList<Integer> arr = new ArrayList<Integer>();
	ArrayList<Integer> result = new ArrayList<Integer>();

	for (int i = 0; i < 10; i++) {
		st = new StringTokenizer(br.readLine().trim());
		int num = Integer.parseInt(st.nextToken());
		arr.add(num % 42);
	}
	for (int i = 0; i < arr.size(); i++) {
		if (!result.contains(arr.get(i))) {
			result.add(arr.get(i));
		}
	}
	System.out.println(result.size());
	*/

}
