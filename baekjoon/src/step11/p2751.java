package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p2751 {
	// 병합정렬, 힙 정렬 이용
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
		if (length == 1) {// 1개면 쪼갤 필요없지
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
		// arr을 idx 0부터 시작해서 새로 구성을 하는거지
		// left = [5],right=[2]라고하면
		// arr[0] = 5가 들어가고, idx와 i(leftPoint역할)이 증가돼
		// 근데 j는 아직 증가가 안됐잖아 그래서 밑에서 그걸 배열에 추가해줘
		// arr[1] = 2라고.
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
		// 최대힙 만들고, delete하면서 정렬
		int length = arr.length;
		// 마지막자식의 루트부터 조지기!
		for (int i = (length / 2) - 1; i >= 0; i--) {
			makeHeap(arr, length, i);
		}

		// 첫번째(가장 큰수)를 마지막에 저장하고, 마지막에 있던 수(root보다 작은수)를 root로 올리고, 최대힙 만들어
		for (int i = length - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			makeHeap(arr, i, 0);
		}
	}

	public static void makeHeap(int[] arr, int length, int i) {

		int max = i;// 임의 idx
		int left = max * 2 + 1;
		int right = left + 1;
		if (left < length && arr[max] < arr[left]) {
			max = left;
		}
		if (right < length && arr[max] < arr[right]) {
			max = right;
		}

		if (max != i) {// 큰 idx가 기존 idx와 다르다면 swap후에, 그걸 또 idx로 넣어줘야지..
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			makeHeap(arr, length, max);
		}
	}

}
