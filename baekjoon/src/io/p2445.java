package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2445 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < (2 * n - 1); i++) {
			if (i < n) {
				for (int j = 0; j <= i; j++) {
					bw.append("*");
				}
				for (int k = (2 * n - i * 2) - 2; k > 0; k--) {
					bw.append(" ");
				}
				for (int l = 0; l <= i; l++) {
					bw.append("*");
				}
			} else {
				for (int j = (2 * n - 1) - i; j > 0; j--) {
					bw.append("*");
				}
				for (int k = 0; k < (i * 2 - 2 * n) + 2; k++) {
					bw.append(" ");
				}
				for (int j = (2 * n - 1) - i; j > 0; j--) {
					bw.append("*");
				}
			}
			bw.append("\n");
		}
		bw.flush();
		bw.close();
	}

}
