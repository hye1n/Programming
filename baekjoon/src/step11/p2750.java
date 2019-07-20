package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2750 {

	// ��������, ��ǰ���� �̿�
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
		// ���� �տ��� �� ���ϴ°ž�.
		for (int i = 1; i < arr.length; i++) {
			int idx = i;
			for (int j = (i - 1); j >= 0; j--) {
				if (arr[idx] < arr[j]) { // �ճ��� ������ Ŀ
					int temp = arr[j];
					arr[j] = arr[idx];// ���ڸ��� ������ ���� �����ϱ�!
					arr[idx] = temp;
					idx = j; // �ڸ� �ٲ������, �� �ڸ��� �� ���ڸ��ϱ�! �̵��ؾ���!
				}
			}
		}
		return arr;
	}

	public static int[] bubbleSort(int[] arr) {
		// index�� 1���� length��°���� �Űܰ���, �� �ճ��̶��� ����
		// �ٵ� �� ȸ���� �������� ���� ������ �پ���
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
