public class IfElseExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 7;
		if (a == b) {
			System.out.println("a�� b�� �����ϴ�. a = b = " + a);
		} else {
			System.out.println("a�� b�� ���� �ʽ��ϴ�.");
			if (a > b) {
				System.out.println("a�� b���� " + (a - b) + "��ŭ �� Ů�ϴ�.");
			} else {
				System.out.println("b�� a���� " + (b - a) + "��ŭ �� Ů�ϴ�.");
			}
		}

	}

}
