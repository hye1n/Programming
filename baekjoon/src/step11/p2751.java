package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p2751 {
	// ��������, �� ���� �̿�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine().trim());
		}
		mergeSort(arr, n);
		// heapSort(arr);
		for (int i : arr) {
			bw.append(i + "\n");
		}
		bw.flush();
		bw.close();
	}

	public static void mergeSort(int[] arr, int length) {
		if (length == 1) {// 1���� �ɰ� �ʿ����
			return;
		}
		int mid = length / 2;
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		int[] right = Arrays.copyOfRange(arr, mid, length);
		mergeSort(left, left.length);
		mergeSort(right, right.length);
		merge(arr, left, right, mid, length - mid);
	}

	public static void merge(int[] arr, int[] left, int[] right, int l, int r) {
		// arr�� idx 0���� �����ؼ� ���� ������ �ϴ°���
		// left = [5],right=[2]����ϸ�
		// arr[0] = 5�� ����, idx�� i(leftPoint����)�� ������
		// �ٵ� j�� ���� ������ �ȵ��ݾ� �׷��� �ؿ��� �װ� �迭�� �߰�����
		// arr[1] = 2���.
		int i = 0, j = 0, idx = 0;
		while (i < l && j < r) {
			if (left[i] > right[j]) {
				arr[idx++] = right[j++];
			} else {
				arr[idx++] = left[i++];
			}
		}
		while (i < l) {
			arr[idx++] = left[i++];
		}
		while (j < r) {
			arr[idx++] = right[j++];
		}

	}

	public static void heapSort(int[] arr) {
		// �ִ��� �����, delete�ϸ鼭 ����
		int length = arr.length;
		// �������ڽ��� ��Ʈ���� ������!
		for (int i = (length / 2) - 1; i >= 0; i--) {
			makeHeap(arr, length, i);
		}

		// ù��°(���� ū��)�� �������� �����ϰ�, �������� �ִ� ��(root���� ������)�� root�� �ø���, �ִ��� �����
		for (int i = length - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			makeHeap(arr, i, 0);
		}
	}

	public static void makeHeap(int[] arr, int length, int i) {

		int max = i;// ���� idx
		int left = max * 2 + 1;
		int right = left + 1;
		if (left < length && arr[max] < arr[left]) {
			max = left;
		}
		if (right < length && arr[max] < arr[right]) {
			max = right;
		}

		if (max != i) {// ū idx�� ���� idx�� �ٸ��ٸ� swap�Ŀ�, �װ� �� idx�� �־������..
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			makeHeap(arr, length, max);
		}
	}

}
