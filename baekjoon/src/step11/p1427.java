package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String num = br.readLine().trim();
		int[] array = new int[10];
		for (int i = 0; i < num.length(); i++) {
			array[num.charAt(i) - '0']++;
		}
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] > 0) {
				for (int j = 0; j < array[i]; j++) {
					bw.append(i + "");
				}
			}
		}
		bw.flush();
		bw.close();
	}

}
