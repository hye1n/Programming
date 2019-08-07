package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class p13549_deque {
	static final int MAX = 100000;
	static int[] time = new int[MAX + 1];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		bfs(n, k);
	}

	public static void bfs(int n, int k) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(n);
		time[n] = 1;
		while (!deque.isEmpty()) {
			int x = deque.poll();
			if (x == k) {
				break;
			}
			if (x * 2 <= MAX && time[x * 2] == 0) {
				deque.addFirst(x * 2);
				time[x * 2] = time[x];
			}
			if (x + 1 <= MAX && time[x + 1] == 0) {
				deque.addLast(x + 1);
				time[x + 1] = time[x] + 1;
			}
			if (x - 1 >= 0 && time[x - 1] == 0) {
				deque.addLast(x - 1);
				time[x - 1] = time[x] + 1;
			}
		}
		System.out.println(time[k] - 1);
	}

}
