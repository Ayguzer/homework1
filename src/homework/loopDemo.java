package homework;

public class loopDemo {

	public static void main(String[] args) {
		// For
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Loop is over.");

		int i = 1;
		// While
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Loop is over");
		// Do-While
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
		System.out.println("Do-While döngüsü bitti.");
	}

}
