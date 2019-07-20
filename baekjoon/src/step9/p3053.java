package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class p3053 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 유클리드 기하각의 원은 파이*r(반지름)제곱
		// 택시기하학은 정사각형이므로 한변의 길이 * 한변의 길이
		// 지름(2*r) = 정사격형의 대각선의 길이 = 한변의 길이 * 루트2
		// r은 반지름, a는 한변의 길이라고 할때,
		// 2*r = 루트2*a => 양변 제곱처리 => 4*r*r = 2*a*a => 약분 => 2*r*r = a*a
		// a*a는 정사각형의 넓이! 즉, 2*r*r을 구한다면 택시기하학의 원의 넓이가 나온다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.000000");
		int r = Integer.parseInt(br.readLine().trim());

		System.out.println(df.format(Math.PI * r * r));
		System.out.println(df.format(2 * r * r));
	}

}
