package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.HashMap;

public class p9020 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tc; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			goldbachConjecture(n);
		}
	}

	public static void goldbachConjecture(int num) {
		// ���࿡ num=16, ���� <3,13>,<5,11>
		// �������� ������ (8,8)�̷��� ������ ���� �ϳ��� ���̰�, �ڴ� �ϳ��� ������Ű��
		// (7,9), (6,10), (5,11),(4,12),(3,13),(2,14) �̷��� ����
		// ���⼭ ù������ �ɸ��°� ���̰� ���� �����ž�..
		for (int i = num / 2; i > 1; i--) {
			int front = i;
			int back = num - i;
			if (checkPrime(front) && checkPrime(back)) {
				System.out.println(front + " " + back);
				break;
			}
		}
	}
	// HashMap�̿�..�ð��� �ʹ� ���� �ɸ�!
	/*
	 * public static void goldbachConjecture(int num) { if (num == 4) {
	 * System.out.println(2 + " " + 2); return; } HashMap<Integer, Integer> map =
	 * new HashMap<Integer, Integer>(); for (int n = 3; n < num; n++) { int
	 * anotherNum = num - n; if (checkPrime(n) && checkPrime(anotherNum)) { if
	 * (!map.containsKey(num) && !map.containsKey(anotherNum)) { map.put(n,
	 * anotherNum); } } }
	 * 
	 * int diff = Integer.MAX_VALUE; int minKey = 0; for (int key : map.keySet()) {
	 * if (Math.abs(key - map.get(key)) < diff) { diff = Math.abs(key -
	 * map.get(key)); minKey = key; } } System.out.println(minKey + " " +
	 * map.get(minKey)); }
	 */

	public static boolean checkPrime(int num) {
		if (num == 1) {
			return false;
		}
		int rootNum = (int) Math.sqrt(num);
		for (int r = 2; r <= rootNum; r++) {
			if (num % r == 0) {
				return false;
			}
		}
		return true;

	}

}
