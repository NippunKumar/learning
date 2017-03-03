package pkg;

public class OneToTenNoLoop {
	public static void main(String[] args) {
		recursive(1);
	}

	private static void recursive(int i) {
		if (i < 10) {
			System.out.println(i);
			recursive(i+1);//not working for recursive(i++);....?

		}

	}

}
