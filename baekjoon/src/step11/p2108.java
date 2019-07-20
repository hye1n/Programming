package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int[] array = new int[n];
		int[] cntArray = new int[8001];
		float sum = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			sum += num;
			array[i] = num;
			cntArray[num + 4000]++;
		}

		bw.append(Math.round(sum / n) + "\n"); // ������(�Ҽ� ù�ڸ����� �ݿø�)
		mergeSort(array, n); // ������������ �����ϱ� ���� mergeSort
		bw.append(array[n / 2] + "\n"); // �߾Ӱ�(���������϶�, �߾ӿ� ��ġ�� ��

		int num = -1, cur = 0;// num�� �� cntArray�� ����Ű�� ����, cur�� �ش� ������ ����
		boolean isSecond = false;// �ι�°�ΰ�?
		for (int i = 0; i < cntArray.length; i++) {
			if (cntArray[i] > cur) {
				cur = cntArray[i];
				num = i;
				isSecond = false;
			} else if (cntArray[i] == cur && !isSecond) {
				cur = cntArray[i];
				num = i;
				isSecond = true;
			}
		}
		bw.append(num - 4000 + "\n");// �ֺ�(������ ���� ��� �ι�°�� ���� ��)
		bw.append(Math.abs(array[n - 1] - array[0]) + "\n"); // ����(�ִ� �ּ� ����)
		bw.flush();
		bw.close();
	}

	public static void mergeSort(int[] array, int length) {
		if (length == 1) {
			return;
		}
		int mid = length / 2;
		int[] left = Arrays.copyOfRange(array, 0, mid);
		int[] right = Arrays.copyOfRange(array, mid, length);

		mergeSort(left, left.length);
		mergeSort(right, right.length);
		merge(array, left, right, mid, length - mid);

	}

	public static void merge(int[] array, int[] left, int[] right, int l, int r) {
		int i = 0, j = 0, idx = 0;
		while (i < l && j < r) {
			if (left[i] > right[j]) {
				array[idx++] = right[j++];
			} else {
				array[idx++] = left[i++];
			}
		}
		while (i < l) {
			array[idx++] = left[i++];
		}
		while (j < r) {
			array[idx++] = right[j++];
		}
	}

}
