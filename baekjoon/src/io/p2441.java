package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2441 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				bw.append(" ");
			}
			for (int k = i; k < n; k++) {
				bw.append("*");
			}
			bw.append("\n");
		}
		bw.flush();
		bw.close();

	}

}