package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		String input = br.readLine().trim();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (int) input.charAt(i) - '0';
		}
		bw.append(String.valueOf(sum));
		bw.flush();
		bw.close();
	}

}
