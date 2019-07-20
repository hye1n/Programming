package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10989 {

	// 계수정렬
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int[] cntArr = new int[10001];
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			cntArr[num]++;
		}

		for (int i = 0; i < cntArr.length; i++) {
			if (cntArr[i] > 0) {
				for (int j = 0; j < cntArr[i]; j++) {
					bw.append(i + "\n");
				}
			}
		}
		bw.flush();
		bw.close();

	}

}
