package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10953 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tc; i++) {
			String[] input = br.readLine().split(",");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			bw.append(String.valueOf(a + b) + "\n");
		}
		bw.flush();
		bw.close();
	}

}
