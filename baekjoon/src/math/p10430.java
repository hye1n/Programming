package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");

		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);

		bw.append(((a + b) % c) + "\n");
		bw.append(((a % c + b % c) % c) + "\n");
		bw.append(((a * b) % c) + "\n");
		bw.append(((a % c * b % c) % c) + "\n");
		bw.flush();
		bw.close();
	}
}
