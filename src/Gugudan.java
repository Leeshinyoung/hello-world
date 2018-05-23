/*
 * for 문으로 구구단을 출력하기
 */
public class Gugudan {

	public static void main(String[] args) {
		for (int i = 1; i <=9; i += 1) {
			for (int j = 1; j <= 9; j += 1) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}

}
