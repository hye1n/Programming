package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1924 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		int[] monthDayArr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] dayArr = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		if (month > 1) {
			for (int i = 1; i < month; i++) {
				day += monthDayArr[i];
			}
		}
		bw.append(dayArr[day % 7]);
		bw.flush();
		bw.close();
	}

}
