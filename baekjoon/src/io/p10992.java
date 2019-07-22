package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10992 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				bw.append(" ");
			}
			bw.append("*");

			for (int k = 0; k < 2 * i - 1; k++) {
				bw.append(" ");
			}
			if (i != 0) {
				bw.append("*");
			}
			bw.append("\n");
		}
		for (int i = 0; i < 2 * n - 1; i++) {
			bw.append("*");
		}
		bw.flush();
		bw.close();

	}

}
