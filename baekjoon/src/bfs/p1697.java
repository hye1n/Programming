package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p1697 {
	static final int MAX = 100000;

	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] dist = new int[MAX + 1];
		Arrays.fill(dist, -1);
		queue.add(n);
		dist[n] = 0;

		while (!queue.isEmpty()) {
			int x = queue.poll();
			if (x == k) {
				break;
			}
			if (x - 1 >= 0 && dist[x - 1] == -1) {
				queue.add(x - 1);
				dist[x - 1] = dist[x] + 1;
			}
			if (x + 1 <= MAX && dist[x + 1] == -1) {
				queue.add(x + 1);
				dist[x + 1] = dist[x] + 1;
			}
			if (x * 2 <= MAX && dist[x * 2] == -1) {
				queue.add(x * 2);
				dist[x * 2] = dist[x] + 1;
			}
		}
		System.out.println(dist[k]);
	}
}