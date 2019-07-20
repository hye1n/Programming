package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p10814 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 가입한 순서대로 입력이 들어온다, 이름은 대소문자로 이루어짐
		// 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오도록
		// 가입한 순서대로 입력이 들어오기 때문에! 이미 가입순은 정렬이 되어있어
		// 그래서 나이순으로만 정렬을 하면 된다..와우내,,,

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine().trim());
		String[][] str = new String[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine().trim());
			str[i][0] = st.nextToken();// 나이
			str[i][1] = st.nextToken();// 이름
		}
		Arrays.sort(str, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		for (String[] i : str) {
			bw.append(i[0] + " " + i[1] + "\n");
		}
		bw.flush();
		bw.close();
	}

}
