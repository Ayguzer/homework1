package homework;

public class sayıBulma {

	public static void main(String[] args) {
		int[] sayılar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 4;
		boolean sayiVarMı = false;

		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				sayiVarMı = true;
				break;
			}
		}
		if (sayiVarMı) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}

	}
}
