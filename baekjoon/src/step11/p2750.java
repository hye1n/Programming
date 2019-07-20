package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2750 {

	// 삽입정렬, 거품정렬 이용
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine().trim());
		}
		int[] result = insertionSort(arr);
		// int[] result = bubbleSort(arr);
		for (int i : result) {
			bw.append(i + "\n");
		}
		bw.flush();
		bw.close();
	}

	public static int[] insertionSort(int[] arr) {
		// 나랑 앞에꺼 다 비교하는거야.
		for (int i = 1; i < arr.length; i++) {
			int idx = i;
			for (int j = (i - 1); j >= 0; j--) {
				if (arr[idx] < arr[j]) { // 앞놈이 나보다 커
					int temp = arr[j];
					arr[j] = arr[idx];// 앞자리로 가야지 내가 작으니까!
					arr[idx] = temp;
					idx = j; // 자리 바뀌었을때, 내 자리는 앞 놈자리니까! 이동해야지!
				}
			}
		}
		return arr;
	}

	public static int[] bubbleSort(int[] arr) {
		// index를 1부터 length번째까지 옮겨가고, 그 앞놈이랑만 비교해
		// 근데 각 회전이 끝날수록 비교할 개수가 줄어들어
		int limit = 1;
		while (limit < arr.length) {
			for (int i = 0; i < arr.length - limit; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
			limit++;
		}
		return arr;
	}

}
