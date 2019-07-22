package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11721 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine().trim();
		int start = 0;
		int end = 10;
		while (start < input.length()) {
			if (input.length() - start < 10) {
				end = input.length();
			}
			bw.append(input.substring(start, end) + "\n");
			start = end;
			end += 10;

		}
		bw.flush();
		bw.close();
	}

}
